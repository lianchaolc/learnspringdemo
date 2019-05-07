package com.example.learnspringdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@MapperScan("com.yukong.chapter4.repository")
@RunWith(SpringRunner.class)
@SpringBootTest
public class LearnspringdemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
