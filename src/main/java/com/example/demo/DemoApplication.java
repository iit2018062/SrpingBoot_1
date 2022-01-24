package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*this anotation tell spring that it is spring application :)*/
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/* first argument to run is demoapplication.class and second is args
		  this is a static method
		  -> it sets up a default confogration,
		  -?start spring application,
		 -> performs class path scan
		 -?start tomcat server**/
		SpringApplication.run(DemoApplication.class, args);
	}

}
