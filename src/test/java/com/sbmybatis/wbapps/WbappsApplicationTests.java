package com.sbmybatis.wbapps;

import com.sbmybatis.wbapps.entity.Person;
import com.sbmybatis.wbapps.entity.WxUser;
import com.sbmybatis.wbapps.service.interf.WxUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WbappsApplicationTests {
    @Autowired
    Person person;
    @Autowired
    WxUserService wxUserService;
    Logger logger=LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
//        System.out.println(person);
        //日志的级别 从低到高 trace debug info warn error
        //可以调节日志输出的级别： 可以设置一个最低日志级别
        logger.trace("这是trace日志");
        logger.debug("debug信息");
        //spring boot默认级别是 info以后的级别  也就是root级别
        logger.info("自定义信息日志");
        logger.warn("警告日志");
        logger.error("错误日志");
        logger.info(person.toString());
    }
    @Test
    public void saveTest(){
        WxUser wxUser=new WxUser();
        wxUser.setId(1L);
    /*    wxUser.setWxCode("00000001");
        wxUser.setBkUsered("aaa");
        wxUser.setBookListNum("{aa}");
        wxUser.setUserName("admin");*/

        wxUserService.synchWxUserForLib(wxUser);
    }
}

