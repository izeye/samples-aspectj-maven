package com.izeye.samples.aspectj;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link AccountAspect}.
 *
 * @author Johnny Lim
 */
public class AccountAspectTests {

	@Test
	public void shouldHaveAspectOfMethod() throws NoSuchMethodException {
		assertThat(AccountAspect.class.getDeclaredMethod("aspectOf")).isNotNull();
	}

}
