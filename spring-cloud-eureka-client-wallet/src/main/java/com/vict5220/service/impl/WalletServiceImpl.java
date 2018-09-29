/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:18:07
 * @version   V 1.0
 */
package com.vict5220.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vict5220.dao.WalletDao;
import com.vict5220.entity.Wallet;
import com.vict5220.service.WalletService;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:18:07
 * @version  V 1.0
 */
@Service
@Slf4j
public class WalletServiceImpl implements WalletService {

	@Autowired
	private WalletDao walletDao;
	
	/** 
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * @param walletName
	 * @param password
	 * @return
	 * @see com.vict5220.service.WalletService#insert(java.lang.String, java.lang.String)  
	 */
	@Transactional
	@Override
	public void insert(String username, String walletName, String password) {
		Wallet wallet = new Wallet().builder().username(username).walletName(walletName).password(password).build();
		try {
			walletDao.save(wallet);
		} catch (Exception e) {
			log.error("存入钱包出错", e);
			throw new RuntimeException("存入钱包出错");
		}
		return;
	}

}
