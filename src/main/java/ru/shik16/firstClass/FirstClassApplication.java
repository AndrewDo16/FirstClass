package ru.shik16.firstClass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
@ComponentScan("ru")
public class FirstClassApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstClassApplication.class, args);
	}

}
