package com.example.learnspringdemo.mapper;

import com.example.learnspringdemo.bean.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Zhaohui on 2018/5/22.
 */

public interface UserMapper {
    @Autowired
//    Integer insert(@Param("id") int id, @Param("username") String username);
    //插入数据
//      insert   into  userinforbyweb  (username, usertel, usertest,usertype) VALUES ('4666','566','666','7666');
//    Integer insert1(@Param("username") String username, @Param("usertel") String usertel, @Param("usertest") String usertest, @Param("usertype") String usertype);
//    @Insert("INSERT INTO userinforbyweb(username,usertel,usertest,usertype) VALUES(#{}, #{usertel}, #{usertest},#{usertest})")
//    void adduser(User user);

    /**
     * 获取全部的数据列表
     */
    public List<String> getAll();

    int save(User user);// 新增用户

    int updata(User user);// 更改用户信息

    int deleteById(int id);// 根据用户id进行删除
    /**
     * 根据id查询
     * @param id
     * @return
     */
    /**
     * 查询所有用户信息
     *
     * @return
     */
    User selectById(int id);

    List<User> selectAll();
}
