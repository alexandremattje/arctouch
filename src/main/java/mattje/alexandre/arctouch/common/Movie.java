package mattje.alexandre.arctouch.common;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import mattje.alexandre.arctouch.common.converters.IntegerIdsToStringNames;

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
	@JsonProperty("genre_ids")
	@JsonDeserialize(converter = IntegerIdsToStringNames.class)
	private List<String> genres;
	@JsonProperty("release_date")
	private Date releaseDate;

}
