package com.fetisov.threehundredbucks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ThreeHundredBucksApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThreeHundredBucksApplication.class, args);
	}

}
