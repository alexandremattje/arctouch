package mattje.alexandre.arctouch.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UrlResolver {

	@Autowired
	private AppProperties appProperties;

	public String resolveUrlWithApiKey(String url, Map<String, Object> params) {
		StringBuilder urlParams = new StringBuilder();
		for (String key : params.keySet()) {
			if (urlParams.length() == 0) {
				urlParams.append(String.format("%s={%s}", key, key));
			} else {
				urlParams.append(String.format("&%s={%s}", key, key));
			}
		}
		return appProperties.getMovieUrl() + url + (urlParams.length() == 0 ? "" : "?" + urlParams);
	}

	public Map<String, Object> getDefaultApiKeyParams() {
		Map<String, Object> params = new HashMap<>();
		params.put("api_key", appProperties.getMovieApiKey());
		return params;
	}
}
