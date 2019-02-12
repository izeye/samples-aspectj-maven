package learningtest.io.micrometer.core.aop;

import io.micrometer.core.aop.TimedAspect;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

/**
 * Tests for {@link TimedAspect}.
 *
 * @author Johnny Lim
 */
public class TimedAspectTests {

	@Test
	public void doesNotHaveAspectOfMethod() {
		assertThatExceptionOfType(NoSuchMethodException.class)
				.isThrownBy(() -> TimedAspect.class.getDeclaredMethod("aspectOf"));
	}

}
