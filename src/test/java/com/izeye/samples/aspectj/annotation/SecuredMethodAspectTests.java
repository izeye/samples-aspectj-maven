package com.izeye.samples.aspectj.annotation;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link SecuredMethodAspect}.
 *
 * @author Johnny Lim
 */
public class SecuredMethodAspectTests {

	@Test
	public void shouldHaveAspectOfMethod() throws NoSuchMethodException {
		assertThat(SecuredMethodAspect.class.getDeclaredMethod("aspectOf")).isNotNull();
	}

}
