/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月30日  下午2:56:40
 * @version   V 1.0
 */
package com.vict5220.facade.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vict5220.facade.UserFacade;
import com.vict5220.service.UserService;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月30日 下午2:56:40
 * @version  V 1.0
 */
@Slf4j
@Service("userFacadeConfirm")
public class UserFacadeConfirm implements UserFacade {

	@Autowired
	private UserService userService;
	
	/** 
	 * <p>Title: createUser</p>
	 * <p>Description: </p>
	 * @param username
	 * @param password
	 * @return
	 * @see com.vict5220.facade.UserFacade#createUser(java.lang.String, java.lang.String)  
	 */
	@Override
	@Transactional
	public void createUser(String username, String password) {
		userService.userRegistConfirm(username, password);
		log.info("用户创建, confirm, username:{}", username);
	}
	
}
