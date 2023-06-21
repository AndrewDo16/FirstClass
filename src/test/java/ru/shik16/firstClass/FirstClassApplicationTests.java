package ru.shik16.firstClass;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstClassApplicationTests {

	@Test
	String contextLoads() {
		return "fine";
	}

}
