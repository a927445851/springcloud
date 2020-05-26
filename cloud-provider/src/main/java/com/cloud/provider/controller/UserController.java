package com.cloud.provider.controller;

import com.cloud.provider.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {
    @GetMapping("/{id}")
    public User findById(@PathVariable int id){
        User user = new User();
        if(id==1){
            user.setId(1);
            user.setSex("男");
            user.setAddress("福建");
            user.setBirthday(new Date());
            user.setUsername("JOIN");
        }else {
            user.setId(2);
            user.setSex("女");
            user.setAddress("厦门");
            user.setBirthday(new Date());
            user.setUsername("NANA");
        }
        return user;
    }
}
