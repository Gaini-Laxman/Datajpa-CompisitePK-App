package com.klinnovations.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "account_table")
public class Account {

	private String accountHolderName;
	private String branchName;

	@EmbeddedId
	private AccountPK accountPK;

}
