package com.kmits.banking.mapper;

import com.kmits.banking.dto.AccountDto;
import com.kmits.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto){
        return  new Account(
                accountDto.id(),
                accountDto.accountHolderName(),
                accountDto.balance()
        );

    }

    public static AccountDto mapToAccountDto(Account account){
        return new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
    }
}
