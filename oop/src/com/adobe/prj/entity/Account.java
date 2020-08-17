package com.adobe.prj.entity;

public class Account {
	private double balance; // state of object
	private static int count = 0; // class member
	
	// default constructor
	public Account() {
		count++;
		this.balance = 0.0;
	}
	
	// parameterized constructor
	public Account(double initAmt) {
		count++;
		System.out.println("Called init constructor !!!");
		this.balance += initAmt;
	}
	public void deposit(double amt) {
		this.balance += amt;
	}
	
	public void withdraw(double amt) {
		this.balance -= amt;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public static int getCount() {
		return count;
	}

	@Override
	public boolean equals(Object obj) {
		Account other = (Account) obj;
		if( this.balance == other.balance)
			return true;
		return false;
	}
	
	
}
