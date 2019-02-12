package com.izeye.samples.aspectj;

/**
 * Aspect for {@link Account}.
 *
 * @author Johnny Lim
 */
public aspect AccountAspect {

	pointcut callWithdraw(int amount, Account account) : call(boolean Account.withdraw(int)) && args(amount) && target(account);

	before(int amount, Account account) : callWithdraw(amount, account) {
	}

	boolean around(int amount, Account account) : callWithdraw(amount, account) {
		if (account.getBalance() < amount) {
			return false;
		}
		return proceed(amount, account);
	}

	after(int amount, Account account) : callWithdraw(amount, account) {
	}

}
