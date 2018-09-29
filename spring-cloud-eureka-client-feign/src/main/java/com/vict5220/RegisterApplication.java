package com.vict5220;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:08:30
 * @version   V 1.0
 */

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:08:30
 * @version  V 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class RegisterApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(RegisterApplication.class, args);
	}
}
