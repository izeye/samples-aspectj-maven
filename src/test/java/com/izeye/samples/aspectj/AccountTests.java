package com.izeye.samples.aspectj;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Account}.
 *
 * @author Johnny Lim
 */
public class AccountTests {

	private Account account;

	@Before
	public void setUp() {
		this.account = new Account();
	}

	@Test
	public void given20WhenWithdraw5ThenSucceed() {
		assertThat(account.withdraw(5)).isTrue();
	}

	@Test
	public void given20WhenWithdraw100ThenFail() {
		assertThat(account.withdraw(100)).isFalse();
	}

}
