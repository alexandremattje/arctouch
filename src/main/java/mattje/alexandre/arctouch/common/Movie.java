package mattje.alexandre.arctouch.common;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import mattje.alexandre.arctouch.common.converters.DateToStringConverter;
import mattje.alexandre.arctouch.common.converters.GenresIdsToStringNamesConverter;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String title;
	@JsonProperty("poster_path")
	private String posterPath;
	@JsonProperty("backdrop_path")
	private String backdropPath;
	@JsonAlias({"genre_ids", "genres"})
	@JsonDeserialize(converter = GenresIdsToStringNamesConverter.class)
	private String genres;
	@JsonProperty("release_date")
	@JsonDeserialize(converter = DateToStringConverter.class)
	private String releaseDate;

}
