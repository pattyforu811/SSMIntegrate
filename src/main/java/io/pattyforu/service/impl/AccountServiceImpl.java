package io.pattyforu.service.impl;

import io.pattyforu.dao.AccountMapper;
import io.pattyforu.domain.Account;
import io.pattyforu.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {
    private AccountMapper accountMapper;

    @Autowired
    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    @Override
    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
        System.out.println("业务层: 保存账户");
    }

    @Override
    public List<Account> findAll() {
        System.out.println("业务层: 查询所有用户");
//        return null;
    return accountMapper.findAll();
    }
}
