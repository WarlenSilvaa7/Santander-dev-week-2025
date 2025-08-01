package me.dio.Santander_dev_week_2025;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class SantanderDevWeek2025Application {

	public static void main(String[] args) {
		SpringApplication.run(SantanderDevWeek2025Application.class, args);
	}

}
