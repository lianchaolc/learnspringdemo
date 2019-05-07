package com.example.learnspringdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;


/***
 * lc 创建项目作为pp商城的后天
 * 20190417
 */
@ComponentScan
@ServletComponentScan
@SpringBootApplication
@MapperScan(value = "com.example.learnspringdemo.mapper")
public class LearnspringdemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(LearnspringdemoApplication.class, args);
	}

}

//整合Mybatis分为两种模式，一种是xml配置，一种是注解。（类似JPA）
//		我在这里重点放在xml配置上，因为如果想用注解的话，建议直接用jpa代替，因为Jpa有更成熟的CRUD接口更方便开发。我在后文中也会把注解方式说清楚。