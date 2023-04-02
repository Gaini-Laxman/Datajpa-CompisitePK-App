package com.klinnovations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.klinnovations.entity.Account;
import com.klinnovations.entity.AccountPK;
import com.klinnovations.repo.AccountRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		AccountRepository repo = ctxt.getBean(AccountRepository.class);

		// setting composite key value
		AccountPK pk = new AccountPK();
		pk.setAccountNumber(1545421221);
		pk.setAccountType("Savings");

		// setting entity data
		Account acc = new Account();
		acc.setAccountHolderName("Anitha");
		acc.setBranchName("KPHB");
		acc.setAccountPK(pk);
		//
		repo.save(acc); // saving the entity object
		System.out.println("Record Saved.....");

	}

}
