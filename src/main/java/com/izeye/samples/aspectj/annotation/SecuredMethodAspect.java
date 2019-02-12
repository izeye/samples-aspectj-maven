package com.izeye.samples.aspectj.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 * {@link Aspect} for {@link Secured}.
 *
 * @author Johnny Lim
 */
@Aspect
public class SecuredMethodAspect {

	@Pointcut("@annotation(secured)")
	public void callAt(Secured secured) {
	}

	@Around("callAt(secured)")
	public Object around(ProceedingJoinPoint pjp, Secured secured) throws Throwable {
		return secured.isLocked() ? null : pjp.proceed();
	}

}
