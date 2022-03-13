package com.jyh.controller;

import com.jyh.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangyiheng
 */
@RestController
public class HelloController {
    @Autowired
    HelloService helloService;

    /**
     * 接口：http://localhost:8080/hello
     * 调用业务；接收前端的请求参数
     * @return
     */
    @GetMapping(value = "/hello")
    public String getHello(){
        return "hello world!!!";
    }

    @RequestMapping("/spring")
    public String hello(){
        return helloService.sayHello("zxc");
    }

}
