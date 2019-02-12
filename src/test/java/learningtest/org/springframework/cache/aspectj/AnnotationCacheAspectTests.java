package learningtest.org.springframework.cache.aspectj;

import org.springframework.cache.aspectj.AnnotationCacheAspect;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link AnnotationCacheAspect}.
 *
 * @author Johnny Lim
 */
public class AnnotationCacheAspectTests {

	@Test
	public void shouldHaveAspectOfMethod() throws NoSuchMethodException {
		assertThat(AnnotationCacheAspect.class.getDeclaredMethod("aspectOf")).isNotNull();
	}

}
