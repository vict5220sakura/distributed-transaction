/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月30日  下午3:16:19
 * @version   V 1.0
 */
package com.vict5220.facade.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vict5220.facade.WalletFacade;
import com.vict5220.service.WalletService;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月30日 下午3:16:19
 * @version  V 1.0
 */
@Service("walletFacadeCancel")
public class WalletFacadeCancel implements WalletFacade {
	
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
	@Transactional
	public void createWallet(String username, String walletName, String password) {
		walletService.createWalletCancel(username, walletName, password);
	}

}
