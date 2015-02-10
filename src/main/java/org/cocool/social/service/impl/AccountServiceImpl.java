package org.cocool.social.service.impl;

import java.util.List;

import org.cocool.social.dao.AccountMapper;
import org.cocool.social.model.Account;
import org.cocool.social.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//实现类
//通过@Service注解，将该类放到Spring上下文环境中，告诉Spring，我这个类是一个Bean，并加入到Spring环境中
//你这个userService在程序启动时，spring自动扫描时，就会自动添加到spring容器中（即，spring上下文中）
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	
	private AccountMapper accountMapper;
	
	public AccountMapper getAccountMapper() {
		return accountMapper;
	}

	@Autowired
	public void setAccountMapper(AccountMapper accountMapper) {
		//通过@Autowired将accountMapper注入到service中
		//通过Spring将Service注入到Spring容器中（上下文中）
		this.accountMapper = accountMapper;
	}
	
	public Account getUserById(Integer id) {//通过主键来查询
		// TODO Auto-generated method stub
		return (Account) accountMapper.selectByPrimaryKey(id);
	}

	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountMapper.getAll();
	}


}
