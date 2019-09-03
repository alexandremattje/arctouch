package mattje.alexandre.arctouch.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

import mattje.alexandre.arctouch.common.Movie;
import mattje.alexandre.arctouch.config.UrlResolver;

@Component
public class MovieModel {

	@Autowired
	private UrlResolver urlResolver;

	public List<Movie> getMovies() {
		RestTemplate restTemplate = new RestTemplate();
		Map<String, Object> urlParams = urlResolver.getDefaultApiKeyParams();
		urlParams.put("page", 2);
		String url = urlResolver.resolveUrlWithApiKey("/movie/popular", urlParams);
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class, urlParams);
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			Map<?, ?> map = objectMapper.readValue(responseEntity.getBody(), Map.class);
			List results = objectMapper.readValue((String) map.get("results"), List.class);
			results.forEach(it -> System.out.println(it));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new ArrayList<>();
	}
}
