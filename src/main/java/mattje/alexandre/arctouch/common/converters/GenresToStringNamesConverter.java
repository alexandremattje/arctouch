package mattje.alexandre.arctouch.common.converters;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import mattje.alexandre.arctouch.common.Genre;
import mattje.alexandre.arctouch.common.MovieDetail;
import org.springframework.stereotype.Component;

import java.util.List;

import static mattje.alexandre.arctouch.config.AppProperties.genres;

@Component
public class GenresToStringNamesConverter implements Converter<List<Genre>, String> {

	@Override
	public String convert(List<Genre> genres) {
		StringBuilder builder = new StringBuilder();

		genres.forEach(it -> {
			int idx = genres.indexOf(Genre.builder().id(it.getId()).build());
			if (idx != -1) {
				if (builder.length() == 0) {
					builder.append(genres.get(idx).getName());
				} else {
					builder.append(", ");
					builder.append(genres.get(idx).getName());
				}
			}
		});
		return builder.toString();
	}

	@Override
	public JavaType getInputType(TypeFactory typeFactory) {
		return typeFactory.constructType(List.class);
	}

	@Override
	public JavaType getOutputType(TypeFactory typeFactory) {
		return typeFactory.constructType(List.class);
	}
}
