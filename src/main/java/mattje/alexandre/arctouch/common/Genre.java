package mattje.alexandre.arctouch.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import com.fasterxml.jackson.annotation.JsonProperty;

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
