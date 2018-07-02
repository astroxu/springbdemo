/*
package com.xcg.springbdemo.user.controller;

import com.xcg.springbdemo.user.dto.User;
import com.xcg.springbdemo.user.repository.UserRepository;
import com.xcg.springbdemo.user.service.UserSerivceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserSerivceImpl userSerivce;

    */
/*查询所有*//*

    @GetMapping("/users")
    public List findUserList(){
        return userRepository.findAll();
    }

    */
/*添加数据*//*

    @PostMapping("/users/addMore")
    public void addMore(){
        userSerivce.addMoreUsers();
    }

    */
/*批量添加数据*//*

    @PostMapping("/users/addList")
    public void addMoreList(){
        userSerivce.addMoreList();
    }

    */
/*添加一个用户数据*//*

    @PostMapping("/users/add")
    public User addUser(@RequestParam("name") String name,
                        @RequestParam("age") Integer age,
                        @RequestParam("sex") String sex){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setSex(sex);
        return userRepository.save(user);

    }



}


*/
