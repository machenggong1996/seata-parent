package com.shengtianyizi.seatacenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SeataCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeataCenterApplication.class, args);
	}

}
