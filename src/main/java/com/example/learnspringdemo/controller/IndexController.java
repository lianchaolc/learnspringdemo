package com.example.learnspringdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class IndexController {
@RequestMapping("/index")
public  String index(){
    return  "hello111111";
}
@RequestMapping("/hello")
    public String hello(){
    return  "aaaaaaa";
}

}
//    Invalid character found in method name. HTTP method names must be tokens   遇到后要用http  请求 不能用https这种方法报错
//  访问url 的路径为  http://localhost:8080/home/hello

//@RestController
//@RequestMapping("/home")
//public class IndexController {
//    @RequestMapping(value = "/name")
//    String getName(@RequestParam(value = "person", defaultValue = "John") String personName) {
//        return "Required element of request param";
//    }
//}



//@RestController
//@RequestMapping("/home")
//public class IndexController {
//    @RequestMapping(method = RequestMethod.GET)
//    String get() {
//        return "Hello from get";
//    }
//    @RequestMapping(method = RequestMethod.DELETE)
//    String delete() {
//        return "Hello from delete";
//    }
//    @RequestMapping(method = RequestMethod.POST)
//    String post() {
//        return "Hello from post";
//    }
//    @RequestMapping(method = RequestMethod.PUT)
//    String put() {
//        return "Hello from put";
//    }
//    @RequestMapping(method = RequestMethod.PATCH)
//    String patch() {
//        return "Hello from patch";
//    }
//}
//
// https://www.iteye.com/news/32657/