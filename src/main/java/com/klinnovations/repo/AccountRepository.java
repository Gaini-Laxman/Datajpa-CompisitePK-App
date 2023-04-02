package com.klinnovations.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.klinnovations.entity.Account;
import com.klinnovations.entity.AccountPK;

public interface AccountRepository extends JpaRepository<Account, AccountPK> {

}
