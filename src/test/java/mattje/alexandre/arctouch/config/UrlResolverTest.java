package mattje.alexandre.arctouch.config;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UrlResolverTest {

	@Autowired
	private UrlResolver urlResolver;

	@Test
	public void testDefaultApiKeyParams() {
		Map<String, Object> params = urlResolver.getDefaultApiKeyParams();

		Assertions.assertThat(params.size()).isEqualTo(1);
		Assertions.assertThat(params.keySet()).contains("api_key");
	}

	@Test
	public void testSearchMovies() {
		String url = urlResolver.resolveUrlWithApiKey("/test", urlResolver.getDefaultApiKeyParams());
		Assertions.assertThat(url).isEqualTo("https://api.themoviedb.org/3/test?api_key={api_key}");
	}

}
