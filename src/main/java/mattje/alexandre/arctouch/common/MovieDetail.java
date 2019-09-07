package mattje.alexandre.arctouch.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import mattje.alexandre.arctouch.common.converters.DateToStringConverter;
import mattje.alexandre.arctouch.common.converters.GenresToStringNamesConverter;

import java.util.List;

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
	private String genres;
	@JsonProperty("release_date")
	@JsonDeserialize(converter = DateToStringConverter.class)
	private String releaseDate;

	@JsonProperty("genres")
	public void setGenres(List<Genre> genres) {
		this.genres = new GenresToStringNamesConverter().convert(genres);
	}
}
