/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午3:52:30
 * @version   V 1.0
 */
package com.vict5220.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vict5220.entity.User;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午3:52:30
 * @version  V 1.0
 */
public interface UserDao extends JpaRepository<User, Integer>{
	User findByUsername(String username);
}
