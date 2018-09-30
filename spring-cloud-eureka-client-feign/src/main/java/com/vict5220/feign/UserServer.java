/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:11:28
 * @version   V 1.0
 */
package com.vict5220.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:11:28
 * @version  V 1.0
 */
@FeignClient(value = "user-server")
public interface UserServer {
	@PostMapping("create_user")
	public void createUser(
			@RequestParam("username") String username, 
			@RequestParam("password") String password);
}
