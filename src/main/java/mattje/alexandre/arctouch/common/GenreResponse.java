package mattje.alexandre.arctouch.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import java.util.List;

public class GenreResponse {
	@Getter
	@JsonProperty("genres")
	private List<Genre> genres;
}
