package mattje.alexandre.arctouch.common;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonProperty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder(toBuilder = true)
public class MovieResponse {

	@JsonProperty("page")
	private int page;
	@JsonProperty("total_results")
	private int totalResults;
	@JsonProperty("total_pages")
	private int totalPages;
	@JsonProperty("results")
	private List<Movie> results;

	private HttpStatus status;

}
