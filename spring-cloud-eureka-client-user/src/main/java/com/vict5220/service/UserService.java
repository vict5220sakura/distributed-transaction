/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:16:45
 * @version   V 1.0
 */
package com.vict5220.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:16:45
 * @version  V 1.0
 */
public interface UserService {

	/**
	 * @author WangWei
	 * @Description 
	 * @method userRegister
	 * @param username
	 * @param password void
	 * @date 2018年9月29日 下午4:59:17
	 */
	@Transactional
	void userRegist(String username, String password);
	
	@Transactional
	void userRegistCancel(String username, String password);
	
	@Transactional
	void userRegistConfirm(String username, String password);
}
