package mattje.alexandre.arctouch.common.converters;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class DateToStringConverter implements Converter<Date, String> {


	private static final String DATE_FORMATTER = "dd/MMMM/YYYY";

	@Override
	public String convert(Date date) {
		DateTimeFormatter fmt = DateTimeFormat.forPattern(DATE_FORMATTER);
		return fmt.print(date.getTime());
	}

	@Override
	public JavaType getInputType(TypeFactory typeFactory) {
		return typeFactory.constructType(Date.class);
	}

	@Override
	public JavaType getOutputType(TypeFactory typeFactory) {
		return typeFactory.constructType(String.class);
	}
}
