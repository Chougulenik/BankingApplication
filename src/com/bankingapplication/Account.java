package com.bankingapplication;

public class Account {
	
	private String number;
	private double balance;
	private String name;
	private String email;
	private String phoneNumber;
	
	public Account(String number, double balance, String name, String email, String phoneNumber) {
		this.number = number;
		this.balance = balance;
		this.name = name;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void depositeMoney(double depositedMoney) {
		this.balance += depositedMoney;
		System.out.println("Deposit is successful, new balance is : "+this.balance);
		
	}
	
	public void withDrowMoney(double withDrawalMoney) {
		if(this.balance - withDrawalMoney < 0) {
			System.out.println("WithDrow Unsuccessful "+this.balance+ "is left");
		}
		else {
			this.balance -= withDrawalMoney;
			System.out.println("Withdrow Successful "+this.balance);
		}
		
	}

	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
}
