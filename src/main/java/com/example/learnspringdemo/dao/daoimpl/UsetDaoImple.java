package com.example.learnspringdemo.dao.daoimpl;

import com.example.learnspringdemo.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class UsetDaoImple implements UserDao {
    @Autowired
//    @Qualifier("sqliteJdbcTemplate")
    JdbcTemplate jdbcTemplate;
    private static final  String INSERT_INSPECT ="INSERT INTO userinforbyweb(username, usertel, usertest,usertype) VALUES('4116','1111','5555','7777')";
    @Override
    public boolean insertUser(String username, String usertel, String usertype, String usertest) {


        return false;
    }
}
