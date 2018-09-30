/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:17:45
 * @version   V 1.0
 */
package com.vict5220.service;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:17:45
 * @version  V 1.0
 */
public interface WalletService {
	
	@Transactional
	void createWallet(String username, String walletName, String password);
	
	@Transactional
	void createWalletConfirm(String username, String walletName, String password);
	
	@Transactional
	void createWalletCancel(String username, String walletName, String password);
}
