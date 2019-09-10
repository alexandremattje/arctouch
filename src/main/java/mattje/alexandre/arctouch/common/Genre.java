package mattje.alexandre.arctouch.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@EqualsAndHashCode(of = "id")
@ToString
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Genre {
	@JsonProperty("id")
	private Integer id;
	@JsonProperty("name")
	private String name;
}
