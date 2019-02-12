package com.izeye.samples.aspectj.annotation;

/**
 * Methods using {@link Secured}.
 *
 * @author Johnny Lim
 */
public class SecuredMethods {

	@Secured(isLocked = true)
	public void lockedMethod() {
	}

	@Secured
	public void unlockedMethod() {
	}

}
