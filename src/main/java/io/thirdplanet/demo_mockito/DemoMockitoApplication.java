package io.thirdplanet.demo_mockito;
//import org.springframework.test.web.client.MockRestServiceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ResourceLoader;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoMockitoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMockitoApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(){
		return new RestTemplate() ;
	}





}
