package org.cocool.social.dao;

import java.util.List;

import org.cocool.social.dao.base.BaseMapper;
import org.cocool.social.model.Account;

/**
 * AccountMapper:继承BaseMapper接口，并声明独有的业务方法
 * 
* */
public interface AccountMapper extends BaseMapper {
	/**
	 * 查询全部的Account实例
	 * @return 数据库中全部的Account实例
	 */
	List<Account> getAll();

}