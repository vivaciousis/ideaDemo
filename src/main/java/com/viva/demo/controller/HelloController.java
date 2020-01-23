package com.viva.demo.controller;

import com.viva.demo.dto.UserDto;
import com.viva.demo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private UserService userService;

    @RequestMapping("/")
    public String index() {
        UserDto userDto = userService.doLogin(null);
        System.out.println(123);
        return "Greetings from Spring Boot!";
    }
    @RequestMapping("/hello")
    public String hello() {
        System.out.println(123);
        return "Greetings from Spring Boot!";
    }
}