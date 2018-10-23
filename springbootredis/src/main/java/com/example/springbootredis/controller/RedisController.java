package com.example.springbootredis.controller;

import com.example.springbootredis.Bean.User;
import com.example.springbootredis.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("rest_redis")
public class RedisController {
    @Resource
    private UserService userService;
    @GetMapping("set")
    public void set() {
        userService.set("key1", new User(1, "meepoguan", 26));
    }
    @GetMapping("get")
    public User get() {
        return userService.get("key1");
    }
    @GetMapping("stringset")
    public void stringset() {
        userService.setcode("stringkey", "meepoguan_coke");
    }
    @GetMapping("stringget")
    public String stringget() {
        System.out.println(userService.getCode("stringkry"));
        return userService.getCode("stringkey");
    }
}