package CFL.CarefreelifeV1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.HiddenHttpMethodFilter;

@SpringBootApplication
public class CarefreelifeV1Application {

	/**
	 * First Project of Chae Seung Min
	 *
	 * Carefreelife
	 *
	 * reference:https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-1/dashboard
	 */

	public static void main(String[] args) {
		SpringApplication.run(CarefreelifeV1Application.class, args);
	}

	@Bean
	public HiddenHttpMethodFilter hiddenHttpMethodFilter() {

		return new HiddenHttpMethodFilter();
	}

}
