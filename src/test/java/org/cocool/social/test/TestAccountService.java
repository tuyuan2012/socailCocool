package org.cocool.social.test;

import static org.junit.Assert.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.apache.log4j.Logger;
import org.cocool.social.model.Account;
import org.cocool.social.service.AccountService;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
//spring-test 第一步 加上@RunWith(SpringJUnit4ClassRunner.class)注解，这句话的意思是继承：extends SpringJUnit4ClassRunnser继承该类的注解

@ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })

//告诉当前类你当前spring上下文需要加载那些配置文件！ @ContextConfiguration(locations = { "classpath:spring.xml", "classpath:spring-mybatis.xml" })
public class TestAccountService {

	//以下是用spring-test来测试，需导入spring-test对应的jar包
	//通过配置文件去获得spring的上下文
	//private static final Logger logger = Logger.getLogger(TestAccountService.class);

	private AccountService accountService;

	public AccountService getAccountService() {
		return accountService;
	}

	@Autowired
	public void setAccountService(AccountService accountService) {//加上注解，自动注入
		this.accountService = accountService;
	}
	
	
	@Test
	public void testGetUserById() {
		Account a = accountService.getUserById(1);
		System.out.println(a.getAname());
		//logger.info(JSON.toJSONStringWithDateFormat(a, "yyyy-MM-dd HH:mm:ss"));
	}

	@Test
	public void testGetAll() {
		List<Account> l = accountService.getAllAccounts();
		System.out.print("----->"+l);
		//我想看到u里面所有的类容呢？此时加入fastjson.jar包，将对象转化成json字符串
		//logger.info(JSON.toJSONStringWithDateFormat(l, "yyyy-MM-dd HH:mm:ss"));
	}

}
