package org.cocool.social.controller;


import javax.servlet.http.HttpServletRequest;

import org.cocool.social.controller.base.BaseController;
import org.cocool.social.model.Account;
import org.cocool.social.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/accountController")
public class AccountController extends BaseController{//怎么去访问这个Controller呢？
	//这个/accountController就是地址：http:localhost:8080/cocool/accountController/showAccount.do
	
	protected AccountService accountService;//业务处

	public AccountService getAccountService() {
		return accountService;
	}

	@Autowired
	public void setAccountService(AccountService accountService) {//自动注入
		this.accountService = accountService;
	}
	
	@RequestMapping("/showAccount/{id}")
	//id是b变量，@PathVariable该注解说明id是一个变量
	public String showAccount(@PathVariable Integer id, HttpServletRequest request) {
		Account a = accountService.getUserById(id);
		//将account存到request当中，存完之后，返回到showUser.jsp中
		request.setAttribute("account", a);//键值是account
		System.out.println(a.getAname());
		//@RequestMapping("/showAccount")
		//访问地址 http:localhost:8080/cocool/accountController/showAccount.do
		
		//@RequestMapping("/showAccount/{id}")
		//http:localhost:8080/cocool/accountController/showAccount/1.do
		
		//访问地址@RequestMapping("/{id}/showUser")
		//http:localhost:8080/cocool/accountController/1/showAccount.do
		return "showAccount";//showAccount表示视图名称，或是一个.jsp页面的名称
	}
	
}
