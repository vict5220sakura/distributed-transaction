/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午3:47:54
 * @version   V 1.0
 */
package com.vict5220.entity;

import org.junit.Test;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午3:47:54
 * @version  V 1.0
 */
@Slf4j
public class UserTest {
	
	@Test
	public void builder(){
		User user = new User.UserBuilder().username("王玮").password("123").build();
		log.info("测试 {}", user);
	}
}
