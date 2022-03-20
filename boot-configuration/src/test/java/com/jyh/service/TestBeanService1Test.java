package com.jyh.service;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
@ExtendWith(SpringExtension.class)
class TestBeanService1Test {
    //注入上下文环境
    @Resource
    private ConfigurableApplicationContext ioc;

    @Test
    void testLoadService() {
        //从测试环境上下文读取xml配置文件
        TestBeanService1 iocBean = ioc.getBean(TestBeanService1.class);
//        boolean flag = ioc.containsBean("TestBeanService");
//        assertTrue(flag);
        log.info(iocBean.getValue());
        log.info(iocBean.getName());
    }

}