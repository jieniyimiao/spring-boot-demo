package com.example.demo;

import com.example.demo.service.impl.UserServiceImpl;
import com.example.demo.vo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	private UserServiceImpl userServiceImpl;

	@Test
	public void contextLoads() {
	}

	@Test
	public void test() {
		List<User> list = userServiceImpl.getByPage();
		for (User user : list )
		{
			System.out.println(user);
		}
		System.out.println("-----------");
	}

}
