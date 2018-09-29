/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:49:52
 * @version   V 1.0
 */
package com.vict5220.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vict5220.facade.WalletFacade;
import com.vict5220.service.WalletService;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:49:52
 * @version  V 1.0
 */
@Service
public class WalletFacadeImpl implements WalletFacade {
	
	@Autowired
	private WalletService walletService;
	
	/** 
	 * <p>Title: insert</p>
	 * <p>Description: </p>
	 * @param username
	 * @param walletName
	 * @param password
	 * @return
	 * @see com.vict5220.facade.WalletFacade#insert(java.lang.String, java.lang.String, java.lang.String)  
	 */
	@Override
	public String insert(String username, String walletName, String password) {
		try {
			walletService.insert(username, walletName, password);
		} catch (Exception e) {
			return "FAIL";
		}
		return "SUCCESS";
	}
	
}
