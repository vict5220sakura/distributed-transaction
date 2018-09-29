/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:49:10
 * @version   V 1.0
 */
package com.vict5220.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vict5220.facade.UserFacade;
import com.vict5220.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:49:10
 * @version  V 1.0
 */
@Service
public class UserFacadeImpl implements UserFacade {

	@Autowired
	private UserService userService;
	
	/** 
	 * <p>Title: createUser</p>
	 * <p>Description: </p>
	 * @param username
	 * @param password
	 * @param walletName
	 * @param walletPwd
	 * @return
	 * @see com.vict5220.facade.UserFacade#createUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String)  
	 */
	@Override
	public String createUser(String username, String password) {
		try {
			userService.userRegister(username, password);
		} catch (Exception e) {
			return "FAIL";
		}
		return "SUCCESS";
	}

}
