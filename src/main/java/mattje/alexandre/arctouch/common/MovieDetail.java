package mattje.alexandre.arctouch.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import mattje.alexandre.arctouch.common.converters.DateToStringConverter;
import mattje.alexandre.arctouch.common.converters.IntegerIdsToStringNamesConverter;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MovieDetail {

	@JsonProperty("id")
	private Integer id;
	@JsonProperty("title")
	private String name;
	@JsonProperty("overview")
	private String overview;
	@JsonProperty("poster_path")
	private String posterPath;
	@JsonProperty("genres")
	@JsonSerialize
	private List<Genre> genres;
	@JsonProperty("release_date")
	@JsonDeserialize(converter = DateToStringConverter.class)
	private String releaseDate;

}
