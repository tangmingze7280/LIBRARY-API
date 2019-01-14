package com.sbmybatis.wbapps;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/sbmybatis/wbapps/dao")
public class WbappsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WbappsApplication.class, args);
    }

}

