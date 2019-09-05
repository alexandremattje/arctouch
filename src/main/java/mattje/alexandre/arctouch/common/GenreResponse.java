package mattje.alexandre.arctouch.common;

import java.util.List;

import lombok.Getter;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GenreResponse {
	@Getter
	@JsonProperty("genres")
	private List<Genre> genres;
}
