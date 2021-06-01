package com.shengtianyizi.seatabank1;

import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@EnableDiscoveryClient
@SpringBootApplication
@MapperScan(basePackages = "com.shengtianyizi.seatabank1.dao")
@EnableFeignClients(basePackages = "com.shengtianyizi.seatabank1.feign")
public class SeataBank1Application {

	public static void main(String[] args) {
		SpringApplication.run(SeataBank1Application.class, args);
	}

}
