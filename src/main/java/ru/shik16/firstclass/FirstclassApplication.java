package ru.shik16.firstclass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScan("ru")
public class FirstclassApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstclassApplication.class, args);
	}

}
