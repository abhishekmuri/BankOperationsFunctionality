package com.bank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bank.model.Account;

@Repository
public interface AccountRepository extends CrudRepository<Account, Long>{
}
