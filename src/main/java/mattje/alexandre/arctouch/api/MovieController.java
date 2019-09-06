package mattje.alexandre.arctouch.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mattje.alexandre.arctouch.common.MovieDetail;
import mattje.alexandre.arctouch.common.MovieResponse;
import mattje.alexandre.arctouch.model.MovieService;
import mattje.alexandre.arctouch.model.SearchMovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private SearchMovieService searchMovieService;

	@Autowired
	private MovieService movieService;

	@GetMapping("/query")
	public ResponseEntity<MovieResponse> queryMovies(@RequestParam String query, @RequestParam int page) {
		MovieResponse response;
		if (StringUtils.isEmpty(query)) {
			response = searchMovieService.upcomingMovies(page);
		} else {
			response = searchMovieService.search(query, page);
		}
		return ResponseEntity.status(response.getStatus()).body(response);
	}

	@GetMapping("/{id}")
	public ResponseEntity<MovieDetail> getMovieDeatils(@PathVariable("id") int movieId) {
		MovieDetail movie = movieService.getDetails(movieId);
		return ResponseEntity.ok(movie);
	}

}
