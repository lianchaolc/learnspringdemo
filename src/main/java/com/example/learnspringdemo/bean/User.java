package com.example.learnspringdemo.bean;

import java.io.Serializable;

public class User implements Serializable {

    public String getUsertype() {
        return usertype;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsertest() {
        return usertest;
    }

    public void setUsertest(String usertest) {
        this.usertest = usertest;
    }

    public String getUsertel() {
        return usertel;
    }

    public void setUsertel(String usertel) {
        this.usertel = usertel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    private String usertype;
    private  String  usertest;
    private  String usertel;
    private  String username;

    @Override
    public String toString() {
        return "User{" +
                '\'' +
                ", usertype='" + usertype + '\'' +
                ", usertest='" + usertest + '\'' +
                ", usertel='" + usertel + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
