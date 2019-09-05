package mattje.alexandre.arctouch.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import lombok.Getter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import mattje.alexandre.arctouch.common.Genre;
import mattje.alexandre.arctouch.model.GenreModel;

@Component
@ConfigurationProperties("application")
public class AppProperties implements ApplicationListener<ApplicationReadyEvent> {

	public static List<Genre> genres = new ArrayList<>();

	@Getter
	@Value("${movieUrl}")
	private String movieUrl;

	@Getter
	@Value("${movieApiKey}")
	private String movieApiKey;

	@Autowired
	private GenreModel genreModel;

	@Override
	public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
		if (genres.isEmpty()) {
			genres = genreModel.load();
		}
	}
}
