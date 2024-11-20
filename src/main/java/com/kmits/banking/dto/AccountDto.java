package com.kmits.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
@Getter
@Setter
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;

}