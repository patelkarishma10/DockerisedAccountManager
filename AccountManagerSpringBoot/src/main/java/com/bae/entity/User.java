package com.bae.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(length = 50)
	private String firstname;
	@Column(length = 50)
	private String lastname;
	@Column(length = 30)
	private String prize;
	@Column(length = 11)
	private String accountnumber;

	public User(long id, String firstname, String lastname, String prize, String accountnumber) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.prize = prize;
		this.accountnumber = accountnumber;
	}

	public User() {

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPrize() {
		return prize;
	}

	public void setPrize(String prize) {
		this.prize = prize;
	}

	public String getAccountNumber() {
		return accountnumber;
	}

	public void setAccountNumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

}
