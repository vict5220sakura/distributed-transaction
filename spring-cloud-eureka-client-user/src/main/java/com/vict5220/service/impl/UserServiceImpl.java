/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:17:08
 * @version   V 1.0
 */
package com.vict5220.service.impl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
@Slf4j
@Service
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
	@Override
	@Transactional
	public void userRegist(String username, String password) {
		User user = new User().builder().username(username).password(password).state(0).build();
		userDao.save(user);
	}

	/** 
	 * <p>Title: userCancel</p>
	 * <p>Description: </p>
	 * @param username
	 * @param password
	 * @see com.vict5220.service.UserService#userCancel(java.lang.String, java.lang.String)  
	 */
	@Override
	@Transactional
	public void userRegistCancel(String username, String password) {
		User user = userDao.findByUsername(username);
		userDao.delete(user);
	}

	/** 
	 * <p>Title: userConfirm</p>
	 * <p>Description: </p>
	 * @param username
	 * @param password
	 * @see com.vict5220.service.UserService#userConfirm(java.lang.String, java.lang.String)  
	 */
	@Override
	@Transactional
	public void userRegistConfirm(String username, String password) {
		User user = userDao.findByUsername(username);
		user.setState(1);
		userDao.save(user);
	}
}
