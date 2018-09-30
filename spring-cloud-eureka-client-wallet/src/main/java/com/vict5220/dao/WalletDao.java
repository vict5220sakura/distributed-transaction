/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:14:15
 * @version   V 1.0
 */
package com.vict5220.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vict5220.entity.Wallet;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:14:15
 * @version  V 1.0
 */
public interface WalletDao extends JpaRepository<Wallet, Integer>{
	Wallet findByUsername(String username);
}
