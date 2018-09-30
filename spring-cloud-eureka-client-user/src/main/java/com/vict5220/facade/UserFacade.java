/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:48:47
 * @version   V 1.0
 */
package com.vict5220.facade;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:48:47
 * @version  V 1.0
 */
public interface UserFacade {

	/**
	 * @author WangWei
	 * @Description 
	 * @method createUser
	 * @param username
	 * @param password
	 * @return String
	 * @date 2018年9月29日 下午5:04:59
	 */
	@Transactional
	void createUser(String username, String password);
}
