package com.izeye.samples.aspectj;

/**
 * Account.
 *
 * @author Johnny Lim
 */
public class Account {

	private int balance = 20;

	public boolean withdraw(int amount) {
		if (this.balance < amount) {
			return false;
		}
		this.balance = this.balance - amount;
		return true;
	}

	public int getBalance() {
		return this.balance;
	}

}
