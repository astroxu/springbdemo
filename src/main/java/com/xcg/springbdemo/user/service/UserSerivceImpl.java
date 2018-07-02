/*
package com.xcg.springbdemo.user.service;

import com.xcg.springbdemo.user.repository.UserRepository;
import com.xcg.springbdemo.user.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service("userSerivce")
public class UserSerivceImpl {
    @Autowired
    UserRepository userRepository;

    */
/*事务控制*//*

    @Transactional
    public void addMoreUsers(){
        User user1 = new User();
        user1.setName("张三");
        user1.setAge(17);
        user1.setSex("男");
        userRepository.save(user1);
        User user2 = new User();
        user2.setName("李四");
        user2.setAge(18);
        user2.setSex("女");
        userRepository.save(user2);
    }

    */
/*list批量操作*//*

    public void addMoreList(){
        List userList = new ArrayList();
        User user1 = new User();
        user1.setName("孙一");
        user1.setAge(40);
        user1.setSex("男");
        userList.add(user1);

        User user2 = new User();
        user2.setName("李六");
        user2.setAge(27);
        user2.setSex("女");
        userList.add(user2);
        //userRepository.save(userList);
    }
}
*/
