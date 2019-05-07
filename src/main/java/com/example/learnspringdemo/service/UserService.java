package com.example.learnspringdemo.service;

import com.example.learnspringdemo.bean.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Zhaohui on 2018/5/22.
 */
public interface UserService {

    /**
     * insrtUset
     *
     * 查询所有
     * @return
     */
  List<String> selectAll();

// 添加用户
    boolean addUser(User user);
////    查询所有
//
//    /**
//     * 查询所有
//     * @return
//     */
//    List<String > getSelectAll();
//    /****
//     * 修改一条数据
//     */
//  boolean  changeUser(String username, String usertel, String ysertype, String usertest);
}
