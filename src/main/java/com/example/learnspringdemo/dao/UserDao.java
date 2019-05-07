package com.example.learnspringdemo.dao;

import org.springframework.context.annotation.ComponentScans;
import org.springframework.stereotype.Component;
import sun.misc.Contended;

@Component
public  interface UserDao {
     boolean insertUser(String username, String usertel,String usertype ,String usertest ) ;
}
