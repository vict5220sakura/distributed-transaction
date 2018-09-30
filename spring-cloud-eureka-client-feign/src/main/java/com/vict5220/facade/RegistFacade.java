/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:13:35
 * @version   V 1.0
 */
package com.vict5220.facade;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:13:35
 * @version  V 1.0
 */
public interface RegistFacade {
	
	@Transactional
	String regist(String username, String password, String walletName, String walletPwd);
}
