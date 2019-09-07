package mattje.alexandre.arctouch.model;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import mattje.alexandre.arctouch.common.MovieDetail;
import mattje.alexandre.arctouch.config.UrlResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Map;

@Component
@Slf4j
public class MovieService {

	@Autowired
	private UrlResolver urlResolver;

	public MovieDetail getDetails(int movieId) {
		Map<String, Object> urlParams = urlResolver.getDefaultApiKeyParams();
		String url = urlResolver.resolveUrlWithApiKey(String.format("/movie/%s", movieId), urlParams);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class, urlParams);
		if (responseEntity.getStatusCode().is2xxSuccessful()) {
			ObjectMapper objectMapper = new ObjectMapper();
			objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			try {
				return objectMapper.readValue(responseEntity.getBody(), MovieDetail.class);
			} catch (IOException e) {
				log.error("Error extracting data from TheMovieDB request", e);
			}
		}
		return MovieDetail.builder().build();
	}

}
