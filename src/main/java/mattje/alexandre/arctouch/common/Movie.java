package mattje.alexandre.arctouch.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
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
