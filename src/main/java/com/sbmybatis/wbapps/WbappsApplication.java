package com.sbmybatis.wbapps;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement // 启注解事务管理，等同于xml配置方式的 <tx:annotation-driven />
@SpringBootApplication
@MapperScan("com/sbmybatis/wbapps/dao")
public class WbappsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WbappsApplication.class, args);

    }


}

