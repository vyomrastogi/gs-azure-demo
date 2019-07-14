package com.battery.az;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GsAzDemoApplication {

/*	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GsAzDemoApplication.class);
    }*/

	public static void main(String[] args) {
		SpringApplication.run(GsAzDemoApplication.class, args);
	}

	@GetMapping(value="/greetings")
	public @ResponseBody ResponseEntity<String> getGreetings () {
		return new ResponseEntity<String>("Welcome to Spring Boot in Azure", HttpStatus.OK);
	}
}
