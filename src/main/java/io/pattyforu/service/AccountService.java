package io.pattyforu.service;

import io.pattyforu.domain.Account;

import java.util.List;

public interface AccountService {

    public void saveAccount(Account account);

    public List<Account> findAll();
}
