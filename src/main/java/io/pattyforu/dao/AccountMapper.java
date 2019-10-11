package io.pattyforu.dao;

import io.pattyforu.domain.Account;

import java.util.List;

public interface AccountMapper {
    public void saveAccount(Account account);

    public List<Account> findAll();
}
