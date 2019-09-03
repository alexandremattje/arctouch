package mattje.alexandre.arctouch.model;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieModelTest {

	@Autowired
	private MovieModel movieModel;

	@Test
	public void testSimpleRequestToMovie() {
		movieModel.getMovies();
	}

}
