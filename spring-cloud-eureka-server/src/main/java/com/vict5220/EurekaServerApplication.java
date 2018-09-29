/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午3:22:33
 * @version   V 1.0
 */
package com.vict5220;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午3:22:33
 * @version  V 1.0
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(EurekaServerApplication.class, args);
	}
}
