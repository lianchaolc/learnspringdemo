package com.example.learnspringdemo.service.imple;

import com.example.learnspringdemo.bean.User;
import com.example.learnspringdemo.mapper.UserMapper;
import com.example.learnspringdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

//import org.apache.log4j.Logger;

/**
 * Created by Zhaohui on 2018/5/22.
 */
@Service
public class UserServiceImpl implements UserService {
//    public static Log log= LogFactory.getLog(UserServiceImpl.class);
    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public List<String> selectAll( ) {
//        Integer insert1(@Param("username") String username, @Param("usertel") String usertel, @Param("usertype") String usertype, @Param("usertest") String usertest);
     List res = userMapper.selectAll() ;
        //afasf
        System.out.println(res + "输出相关的");
        return res;
    }

    /***
     * 增加一条数据到
     */

    @Override
    public boolean addUser(User  user) {
//        User user1 = new User();

        // 返回插入的记录数 ，期望是1条 如果实际不是一条则抛出异常
        boolean result= userMapper.save(user)>0;
//        boolean result = userMapper.save(user) > 0;
//        System.out.println(result + "输出相关的" + user.getUsername());
        return result;
    }

    /**
     * 获取到所有的数据表
     *
     * @return
     */
//    @Override
//    public List<String> getSelectAll() {
//        List<String> resultAll = userMapper.getAll();
//        System.out.print(resultAll);
//        return resultAll;
//    }


    /***
     * 修改某一条数据
     * @param username
     * @param usertel
     * @param ysertype
     * @param usertest
     * @return
     */
//    @Override
//    public boolean changeUser(String username, String usertel, String ysertype, String usertest) {
//        return false;
//    }


}
