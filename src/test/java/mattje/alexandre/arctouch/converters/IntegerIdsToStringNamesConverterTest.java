package mattje.alexandre.arctouch.converters;

import mattje.alexandre.arctouch.common.Genre;
import mattje.alexandre.arctouch.common.converters.GenresIdsToStringNamesConverter;
import mattje.alexandre.arctouch.model.GenreService;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IntegerIdsToStringNamesConverterTest {

	@Test
	public void testNineElements() {
		GenresIdsToStringNamesConverter converter = new GenresIdsToStringNamesConverter();
		String convertedValue = converter.convert(Arrays.asList(28, 12));
		Assertions.assertThat(convertedValue).isEqualTo("Action, Adventure");
	}

	@Test
	public void testOneElement() {
		GenresIdsToStringNamesConverter converter = new GenresIdsToStringNamesConverter();
		String convertedValue = converter.convert(Arrays.asList(12));
		Assertions.assertThat(convertedValue).isEqualTo("Adventure");
	}

	@Test
	public void testNoneElement() {
		GenresIdsToStringNamesConverter converter = new GenresIdsToStringNamesConverter();
		String convertedValue = converter.convert(new ArrayList<>());
		Assertions.assertThat(convertedValue).isEqualTo("");
	}

}
