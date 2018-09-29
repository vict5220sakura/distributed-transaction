/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:33:32
 * @version   V 1.0
 */
package com.vict5220.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vict5220.facade.RegistFacade;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:33:32
 * @version  V 1.0
 */
@RestController
public class RegistController {
	
	@Autowired
	private RegistFacade registFacade;
	
	@PostMapping("regist")
	public String regist(
			@RequestParam("username") String username, 
			@RequestParam("password") String password, 
			@RequestParam("wallet_name") String walletName, 
			@RequestParam("wallet_pwd") String walletPwd 
			){
		return registFacade.regist(username, password, walletName, walletPwd);
	}
}
