package com.example.learnspringdemo.controller;

import com.example.learnspringdemo.bean.User;
import com.example.learnspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhaohui on 2018/5/22.
 * 请求的数据是controller
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
//插入信息
    @PostMapping("/insertUser")
    public boolean insertUser(String username, String usertel,String usertype ,String usertest){
//        //asfasdfasdf
////        boolean res = userService.insertUser(username,usertel,usertype,usertest);
        //sfasdasdf
//        System.out.print(res);
        return true;
    }

    @PostMapping("/addUser")
         public boolean addUser(User user){
         boolean  result=userService.addUser(user);
         return  result;
    }


}
