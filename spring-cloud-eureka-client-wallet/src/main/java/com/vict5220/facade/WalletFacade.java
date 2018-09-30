/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午4:49:34
 * @version   V 1.0
 */
package com.vict5220.facade;

import org.springframework.transaction.annotation.Transactional;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午4:49:34
 * @version  V 1.0
 */
public interface WalletFacade {
	@Transactional
	void createWallet(String username, String walletName, String password);
}
