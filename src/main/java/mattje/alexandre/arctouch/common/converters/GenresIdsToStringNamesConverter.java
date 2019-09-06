package mattje.alexandre.arctouch.common.converters;

import static mattje.alexandre.arctouch.config.AppProperties.genres;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

import mattje.alexandre.arctouch.common.Genre;

public class GenresIdsToStringNamesConverter implements Converter<List<Integer>, String> {

	@Override
	public String convert(List<Integer> integers) {
		StringBuilder builder = new StringBuilder();

		integers.forEach(it -> {
			int idx = genres.indexOf(Genre.builder().id(it).build());
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
