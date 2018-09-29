/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午3:53:22
 * @version   V 1.0
 */
package com.vict5220.Dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.vict5220.UserApplication;
import com.vict5220.dao.UserDao;
import com.vict5220.entity.User;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午3:53:22
 * @version  V 1.0
 */
@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = UserApplication.class)
public class UserDaoTest {
	
	@Autowired
	private UserDao userDao;
	
	@Test
	public void insert(){
		User user = new User().builder().username("王玮").password("123").build();
		userDao.save(user);
	}
}
