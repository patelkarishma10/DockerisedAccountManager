package com.bae.entity;

public class SentUser {

	private String firstname;

	private String lastname;

	private String prize;

	private String accountnumber;

	public SentUser() {

	}

	public SentUser(String firstname, String lastname, String prize, String accountnumber) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.prize = prize;
		this.accountnumber = accountnumber;
	}

//	public long getId() {
//		return sentId;
//	}
//
//	public void setId(long id) {
//		this.sentId = id;
//	}

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

	public String getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(String accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Override
	public String toString() {
		return "" + firstname + lastname;
	}

}