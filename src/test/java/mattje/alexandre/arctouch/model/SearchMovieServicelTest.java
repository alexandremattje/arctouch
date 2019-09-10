package mattje.alexandre.arctouch.model;

import mattje.alexandre.arctouch.common.MovieResponse;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SearchMovieServicelTest {

	@Autowired
	private SearchMovieService searchMovieService;

	@Test
	public void testDiscoverMovies() {
		MovieResponse response = searchMovieService.upcomingMovies(1);
		Assertions.assertThat(response.getPage()).isEqualTo(1);
		Assertions.assertThat(response.getResults().size()).isGreaterThan(1);
	}

	@Test
	public void testSearchMovies() {
		MovieResponse response = searchMovieService.search("old", 1);
		Assertions.assertThat(response.getPage()).isEqualTo(1);
		Assertions.assertThat(response.getResults().size()).isGreaterThan(1);
	}

}
