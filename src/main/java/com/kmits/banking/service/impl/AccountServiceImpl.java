package com.kmits.banking.service.impl;

import com.kmits.banking.dto.AccountDto;
import com.kmits.banking.entity.Account;
import com.kmits.banking.mapper.AccountMapper;
import com.kmits.banking.repository.AccountRepository;
import com.kmits.banking.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }
}
