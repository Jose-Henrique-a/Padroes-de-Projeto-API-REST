package onedigitalinnovationgof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Projeto Spring Boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPA
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 * 
 * @author Jose-Henrique-a
 */
@EnableFeignClients
@SpringBootApplication
@ComponentScan(basePackages = "onedigitalinnovationgof")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
