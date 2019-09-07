package mattje.alexandre.arctouch.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

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
