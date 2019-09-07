package mattje.alexandre.arctouch.model;

import java.io.IOException;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mattje.alexandre.arctouch.common.MovieResponse;
import mattje.alexandre.arctouch.config.UrlResolver;

@Component
@Slf4j
public class SearchMovieService {

	@Autowired
	private UrlResolver urlResolver;

	@Cacheable("upcomingMovies")
	public MovieResponse upcomingMovies(int page) {
		Map<String, Object> urlParams = urlResolver.getDefaultApiKeyParams();
		urlParams.put("page", page);
		String url = urlResolver.resolveUrlWithApiKey("/movie/upcoming", urlParams);
		return getMovieResponse(url, urlParams);
	}

	@Cacheable("search")
	public MovieResponse search(String query, int page) {
		Map<String, Object> urlParams = urlResolver.getDefaultApiKeyParams();
		urlParams.put("page", page);
		urlParams.put("query", query);
		String url = urlResolver.resolveUrlWithApiKey("/search/movie", urlParams);
		return getMovieResponse(url, urlParams);
	}

	private MovieResponse getMovieResponse(String url, Map<String, Object> urlParams) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class, urlParams);
		if (responseEntity.getStatusCode().is2xxSuccessful()) {
			return this.extratMovieResponseFromJson(responseEntity.getBody())
					.toBuilder()
					.status(HttpStatus.OK)
					.build();
		}
		return MovieResponse.builder()
				.status(responseEntity.getStatusCode())
				.build();
	}

	private MovieResponse extratMovieResponseFromJson(String json) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(json, MovieResponse.class);
		} catch (IOException e) {
			log.error("Error extracting data from TheMovieDB request", e);
		}
		return MovieResponse.builder().build();
	}

}
