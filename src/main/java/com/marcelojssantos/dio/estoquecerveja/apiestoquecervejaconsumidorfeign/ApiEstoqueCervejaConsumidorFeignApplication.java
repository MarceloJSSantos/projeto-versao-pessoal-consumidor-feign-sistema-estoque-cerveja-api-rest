package com.marcelojssantos.dio.estoquecerveja.apiestoquecervejaconsumidorfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ApiEstoqueCervejaConsumidorFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiEstoqueCervejaConsumidorFeignApplication.class, args);
	}

}
