package mattje.alexandre.arctouch.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mattje.alexandre.arctouch.common.MovieResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieModelTest {

	@Autowired
	private SearchMovieService movieModel;

	@Test
	public void testDiscoverMovies() {
		MovieResponse response = movieModel.discoverMovies(1);
		Assertions.assertThat(response.getPage()).isEqualTo(1);
		Assertions.assertThat(response.getResults().size()).isGreaterThan(1);
	}

	@Test
	public void testSearchMovies() {
		MovieResponse response = movieModel.search("old", 1);
		Assertions.assertThat(response.getPage()).isEqualTo(1);
		Assertions.assertThat(response.getResults().size()).isGreaterThan(1);
	}

}
