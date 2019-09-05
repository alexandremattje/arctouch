package mattje.alexandre.arctouch.common.converters;

import static mattje.alexandre.arctouch.config.AppProperties.genres;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

import mattje.alexandre.arctouch.common.Genre;

@Component
public class IntegerIdsToStringNames implements Converter<List<Integer>, List<String>> {

	@Override
	public List<String> convert(List<Integer> integers) {
		List<String> arrayInString = new ArrayList<>();

		integers.forEach(it -> {
			int idx = genres.indexOf(Genre.builder().id(it).build());
			if (idx != -1) {
				arrayInString.add(genres.get(idx).getName());
			}
		});
		return arrayInString;

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
