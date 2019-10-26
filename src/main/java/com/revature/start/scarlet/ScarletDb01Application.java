package com.revature.start.scarlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication

//@CrossOrigin(origins = "", allowedHeaders = "", methods = { RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT,
       //RequestMethod.DELETE })
public class ScarletDb01Application {

	public static void main(String[] args) {
		SpringApplication.run(ScarletDb01Application.class, args);
	}

}
