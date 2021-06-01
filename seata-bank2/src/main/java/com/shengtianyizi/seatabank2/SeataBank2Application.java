package com.shengtianyizi.seatabank2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.shengtianyizi.seatabank2.dao")
public class SeataBank2Application {

	public static void main(String[] args) {
		SpringApplication.run(SeataBank2Application.class, args);
	}

}
