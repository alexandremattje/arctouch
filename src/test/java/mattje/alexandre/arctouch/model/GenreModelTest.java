package mattje.alexandre.arctouch.model;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import mattje.alexandre.arctouch.common.Genre;
import mattje.alexandre.arctouch.common.MovieResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GenreModelTest {

	@Autowired
	private GenreModel genreModel;

	@Test
	public void testLoadGenre() {
		List<Genre> genres = genreModel.load();
		Assertions.assertThat(genres.size()).isGreaterThan(1);
	}

	@Test
	public void testLoadAndFindGenre() {
		List<Genre> genres = genreModel.load();
		Assertions.assertThat(genres.size()).isGreaterThan(1);
		Assertions.assertThat(genres).contains(Genre.builder().id(28).build());

		Assertions.assertThat(genres.indexOf(Genre.builder().id(28).build())).isGreaterThan(-1);
	}

	@Test
	public void testGetNameGenre() {
		String name = genreModel.getName(28);
		Assertions.assertThat(name).isEqualTo("Action");
	}
}
