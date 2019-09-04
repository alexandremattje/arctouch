package mattje.alexandre.arctouch.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import mattje.alexandre.arctouch.common.MovieResponse;
import mattje.alexandre.arctouch.model.SearchMovieService;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private SearchMovieService movieModel;

	@GetMapping("/query")
	public ResponseEntity<MovieResponse> queryMovies(@RequestParam String query, @RequestParam int page) {
		MovieResponse response;
		if (StringUtils.isEmpty(query)) {
			response = movieModel.discoverMovies(page);

		} else {
			response = movieModel.search(query, page);
		}
		return ResponseEntity.status(response.getStatus()).body(response);
	}

}
