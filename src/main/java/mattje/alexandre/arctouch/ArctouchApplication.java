package mattje.alexandre.arctouch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ArctouchApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArctouchApplication.class, args);
	}

}
