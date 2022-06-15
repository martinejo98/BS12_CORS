package com.example.BS12_CORS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example.BS9_Clase_RestTemplate_Usos_con_Feign.feign")
public class Bs12CorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(Bs12CorsApplication.class, args);
	}

}
