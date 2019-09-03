package mattje.alexandre.arctouch.config;

import java.util.HashMap;
import java.util.Map;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("application")
public class AppProperties {

	@Getter
	@Value("${movieUrl}")
	private String movieUrl;

	@Getter
	@Value("${movieApiKey}")
	private String movieApiKey;

}
