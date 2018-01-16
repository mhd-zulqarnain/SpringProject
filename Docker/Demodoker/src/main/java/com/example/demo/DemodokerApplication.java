package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* https://git.heroku.com/serene-sands-72379.git
*
* */
@SpringBootApplication
public class DemodokerApplication {

	public static void main(String[] args) {

		String ENV_PORT = System.getenv().get("PORT");
		String ENV_DYNO = System.getenv().get("DYNO");
		if(ENV_PORT != null && ENV_DYNO != null) {
			System.getProperties().put("server.port", ENV_PORT);
		}//docker image build -t registry.heroku.com/serene-sands-72379/web .
		SpringApplication.run(DemodokerApplication.class, args);
	}
}
