package com.sbmybatis.wbapps.controller;

import com.sbmybatis.wbapps.comment.CommonResult;
import com.sbmybatis.wbapps.entity.Classifications;
import com.sbmybatis.wbapps.service.interf.ClassifService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/class")
public class BookClassifiController {
    private final static Logger LOGGER= LoggerFactory.getLogger(BookClassifiController.class);
    @Autowired
    private ClassifService classifService;
    @GetMapping("/getClassisfList")
    public CommonResult getAllClassType(){
        List<Classifications> allParentByNumber = classifService.getAllParentByNumber();
        List<String> result=new ArrayList<>();

        for(Classifications cfis:allParentByNumber){
            result.add(cfis.getName());
            if(result.size()==6){
                break;
            }
        }
        CommonResult commonResult =new CommonResult();
        commonResult.setData(result);
        LOGGER.info(commonResult.toString());
      /*  Map<String,String> parse = (Map)JSONUtils.parse("{\"a\":\"20\"}");
        LOGGER.info(parse.get("a"));*/
        return commonResult;
    }


}
