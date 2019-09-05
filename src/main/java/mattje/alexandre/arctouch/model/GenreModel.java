package mattje.alexandre.arctouch.model;

import static mattje.alexandre.arctouch.config.AppProperties.genres;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import mattje.alexandre.arctouch.common.Genre;
import mattje.alexandre.arctouch.common.GenreResponse;
import mattje.alexandre.arctouch.config.AppProperties;
import mattje.alexandre.arctouch.config.UrlResolver;

@Component
@Slf4j
public class GenreModel {

	@Autowired
	private UrlResolver urlResolver;

	@Autowired
	private AppProperties appProperties;

	public List<Genre> load() {
		Map<String, Object> urlParams = urlResolver.getDefaultApiKeyParams();
		String url = urlResolver.resolveUrlWithApiKey("/genre/movie/list", urlParams);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class, urlParams);
		if (responseEntity.getStatusCode().is2xxSuccessful()) {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			try {
				GenreResponse response = objectMapper.readValue(responseEntity.getBody(), GenreResponse.class);
				return response.getGenres();
			} catch (IOException e) {
				log.error("Error extracting data from TheMovieDB request", e);
			}
		}
		return new ArrayList<>();
	}

	public String getName(int genreId) {
		int idx = genres.indexOf(Genre.builder().id(genreId).build());
		if (idx == -1) {
			return "";
		} else {
			return genres.get(idx).getName();
		}
	}
}
