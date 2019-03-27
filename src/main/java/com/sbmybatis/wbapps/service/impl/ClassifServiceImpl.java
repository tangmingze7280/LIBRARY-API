package com.sbmybatis.wbapps.service.impl;

import com.sbmybatis.wbapps.entity.Classifications;
import com.sbmybatis.wbapps.respository.ClassificationsRepository;
import com.sbmybatis.wbapps.service.interf.ClassifService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@Service
public class ClassifServiceImpl implements ClassifService {
    private static final Logger logger= LoggerFactory.getLogger(ClassifServiceImpl.class);
    @Autowired
    private ClassificationsRepository classificationsRepository;
    @Override
    public List<Classifications> getClassType() {
        return classificationsRepository.findAll();
    }

    @Override
    public List<Classifications> getAllParentByNumber() {
        String[] num=new String[26];
        for(int i=0;i<26;i++){
            num[i]=(char)('A'+i)+"";
        }
        logger.info(Arrays.toString(num));
        return classificationsRepository.getAllByNumberIn(num);
    }
}
