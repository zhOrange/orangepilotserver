package com.orange.orangepilotserver.controller;

import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
@RequestMapping("/api/hello")
public class HelloDemoController {

    /**
     * 返回一个简单的问候信息。
     *
     * @return 问候字符串
     */
    @GetMapping
    public String sayHello() {
        log.info("Hello application");
        return "Hello, Welcome to the Demo Application!";
    }

    /**
     * 返回带有参数的个性化问候信息。
     *
     * @param name 用户名
     * @return 个性化的问候字符串
     */
    @GetMapping("/greet/{name}")
    public String greetUser(@PathVariable("name") String name) {
        return String.format("Hello, %s! Nice to see you!", name);
    }
}