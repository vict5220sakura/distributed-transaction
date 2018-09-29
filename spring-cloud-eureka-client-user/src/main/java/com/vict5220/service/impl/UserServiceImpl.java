/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:17:08
 * @version   V 1.0
 */
package com.vict5220.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vict5220.dao.UserDao;
import com.vict5220.entity.User;
import com.vict5220.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:17:08
 * @version  V 1.0
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	/** 
	 * <p>Title: userRegister</p>
	 * <p>Description: </p>
	 * @param username
	 * @param paswsword
	 * @param walletName
	 * @param walletPwd
	 * @return
	 * @see com.vict5220.service.UserService#userRegister(java.lang.String, java.lang.String, java.lang.String, java.lang.String)  
	 */
	@Transactional
	@Override
	public void userRegister(String username, String password) {
		User user = new User().builder().username(username).password(password).build();
		try {
			userDao.save(user);
		} catch (Exception e) {
			log.error("存入用户失败", e);
			throw new RuntimeException("存入用户失败");
		}
		return;
	}
	
}
