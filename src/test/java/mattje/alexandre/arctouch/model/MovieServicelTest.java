package mattje.alexandre.arctouch.model;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mattje.alexandre.arctouch.common.MovieDetail;
import mattje.alexandre.arctouch.common.MovieResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieServicelTest {

	@Autowired
	private MovieService movieService;

	@Test
	public void testGetDetails() {
		MovieDetail movie = movieService.getDetails(474350);
		Assertions.assertThat(movie.getId()).isEqualTo(474350);
	}

}
