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

import mattje.alexandre.arctouch.common.converters.DateToStringConverter;
import mattje.alexandre.arctouch.common.converters.IntegerIdsToStringNamesConverter;

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
	@JsonProperty("genre_ids")
	@JsonDeserialize(converter = IntegerIdsToStringNamesConverter.class)
	private List<String> genres;
	@JsonProperty("release_date")
	@JsonDeserialize(converter = DateToStringConverter.class)
	private String releaseDate;

}