package org.cocool.social.service;

import java.util.List;
import org.cocool.social.model.*;


public interface AccountService {
	
	public Account getUserById(Integer id);

	List<Account> getAllAccounts();
}
