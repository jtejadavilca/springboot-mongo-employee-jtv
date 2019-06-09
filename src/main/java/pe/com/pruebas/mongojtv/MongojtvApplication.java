package pe.com.pruebas.mongojtv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MongojtvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongojtvApplication.class, args);
	}

}
