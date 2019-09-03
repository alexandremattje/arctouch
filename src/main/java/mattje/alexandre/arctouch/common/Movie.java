package mattje.alexandre.arctouch.common;

import lombok.Builder;
import lombok.Data;

import com.fasterxml.jackson.annotation.JsonProperty;

@Builder
@Data
public class Movie {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String name;
	@JsonProperty("overview")
	private String overview;
	@JsonProperty("poster_path")
	private String poster_path;
	@JsonProperty("backdrop_path")
	private String backdrop_path;

}
