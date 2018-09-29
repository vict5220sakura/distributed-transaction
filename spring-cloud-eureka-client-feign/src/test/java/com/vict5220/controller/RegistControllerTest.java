/**
 * @Description 
 * @author  WangWei
 * @Date    2018年9月29日  下午5:35:47
 * @version   V 1.0
 */
package com.vict5220.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.io.UnsupportedEncodingException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.vict5220.RegisterApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description 
 * @author   WangWei
 * @date     2018年9月29日 下午5:35:47
 * @version  V 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RegisterApplication.class)
@WebAppConfiguration
@Slf4j
public class RegistControllerTest {
	private MockMvc mockMvc;

	@Autowired
	private WebApplicationContext wac;
	
	@Before // 这个方法在每个方法执行之前都会执行一遍
	public void setup() {
		mockMvc = MockMvcBuilders.webAppContextSetup(wac).build(); // 初始化MockMvc对象
	}
	
	@Test
	public void createUser() throws UnsupportedEncodingException, Exception{
		RequestBuilder request;
		request = post("/regist")
				.param("username", "王玮")
				.param("password", "王玮的密码")
				.param("wallet_name", "王玮的钱包")
				.param("wallet_pwd", "王玮的钱包密吗")
				.contentType(MediaType.APPLICATION_FORM_URLENCODED)
				.accept(MediaType.TEXT_PLAIN);
		
		String responseStr = mockMvc.perform(request)
				.andExpect(status().isOk())
				.andDo(print())
				.andReturn().getResponse().getContentAsString();
		
		log.info("测试 {}", responseStr);
	}
}
