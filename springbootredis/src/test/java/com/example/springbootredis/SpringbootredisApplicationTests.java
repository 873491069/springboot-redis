package com.example.springbootredis;

import com.example.springbootredis.Bean.User;
import com.example.springbootredis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootredisApplicationTests {


    @Autowired
    private UserService userService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void setname() {
        userService.set("key2", new User(1, "123", 26));
    }
    @Test
    public void getname() {
         System.out.println( userService.get("key2").getName());
    }
    @Test
    public void set(){
        userService.setcode("abc","123456");
    }
    @Test
    public void stringget() {
        //return userService.getCode("stringkey");
        System.out.println(userService.getCode("abc"));
    }

}
