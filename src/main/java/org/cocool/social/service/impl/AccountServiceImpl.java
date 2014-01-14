package org.cocool.social.service.impl;

import java.util.List;

import org.cocool.social.dao.AccountMapper;
import org.cocool.social.model.Account;
import org.cocool.social.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//实现类
@Service("accountService")
public class AccountServiceImpl implements AccountService {
	//通过@Service注解，将该类放到Spring上下文环境中，告诉Spring，我这个类是一个Bean，并加入到Spring环境中
	
	private AccountMapper accountMapper;
	
	public AccountMapper getUserMapper() {
		return accountMapper;
	}

	@Autowired
	public void setUserMapper(AccountMapper accountMapper) {//通过@Autowired将userMapper注入到service中
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
