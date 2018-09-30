/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午3:31:47
 * @version   V 1.0
 */
package com.vict5220;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.bytesoft.bytejta.supports.jdbc.LocalXADataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;


/**
 * @Description
 * @author WangWei
 * @date 2018年9月29日 下午3:31:47
 * @version V 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@ImportResource({ "classpath:bytetcc-supports-springcloud.xml" })
public class UserApplication {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(UserApplication.class, args);
	}

}
