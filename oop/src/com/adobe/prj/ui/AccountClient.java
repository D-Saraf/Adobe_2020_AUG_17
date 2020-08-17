package com.adobe.prj.ui;

import com.adobe.prj.entity.Account;

public class AccountClient {

	public static void main(String[] args) {
		Account first = new Account(500); // instance of Account [ first is an Object of Account class]
		
		Account second = new Account();
		
		first.deposit(5000); // mutate the state
		
		second.deposit(6000);
		
		System.out.println("First Account");
		System.out.println(first.getBalance()); // accessor
		
		System.out.println("Second Account");
		System.out.println(second.getBalance());
		
		System.out.println("Count " + Account.getCount());
		System.out.println("Count " + Account.getCount());

		
		Account a1 = new Account(1000);
		Account a2 = new Account(1000);
		Account a3 = a1;
		
		if(a1 == a2) {
			System.out.println("same!!");
		}
		if(a1 == a3) {
			System.out.println("a1 and a3 are same!!");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1 and a2 same content!!!");
		}
		
		
	}

}
