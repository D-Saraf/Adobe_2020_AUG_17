package com.adobe.prj.ui;

import com.adobe.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account(); // instance of Account [ first is an Object of Account class]
		
		Account second = new Account();
		
		first.deposit(5000);
		
		second.deposit(6000);
		
		System.out.println("First Account");
		System.out.println(first.getBalance());
		
		System.out.println("Second Account");
		System.out.println(second.getBalance());
	}

}
