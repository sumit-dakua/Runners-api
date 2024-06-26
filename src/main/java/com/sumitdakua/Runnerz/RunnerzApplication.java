package com.sumitdakua.Runnerz;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sumitdakua.Runnerz.run.Location;
import com.sumitdakua.Runnerz.run.Run;

@SpringBootApplication
public class RunnerzApplication {

	public static final Logger logger = LoggerFactory.getLogger(RunnerzApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RunnerzApplication.class, args);
	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1,"First Time",LocalDateTime.now(),LocalDateTime.now().plus(1,ChronoUnit.HOURS),5,Location.OUTDOOR);

			logger.info("Run" + run);
			
		};
	}
}
