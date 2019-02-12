package com.izeye.samples.aspectj.annotation;

import org.junit.Test;

/**
 * Tests for {@link SecuredMethods}.
 *
 * @author Johnny Lim
 */
public class SecuredMethodsTests {

	@Test
	public void test() {
		SecuredMethods methods = new SecuredMethods();
		methods.unlockedMethod();
		methods.lockedMethod();
	}

}
