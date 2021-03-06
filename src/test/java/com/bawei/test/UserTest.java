package com.bawei.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bawei.cms.dao.UserDao;
import com.bawei.cms.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class UserTest {
	@Resource
	private UserDao userDao;
	@Test
	public void test() {
		List<User> userList=userDao.select(null);
		System.out.println(userList);
		User user = new User();
		user.setNickname("wangwu");
		//userDao.insert(user);
		user.setId(201);
		//userDao.update(user);
		//userDao.delete("201");
		User selectById = userDao.selectById(199);
		System.out.println(selectById);
	}
}
