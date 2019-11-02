package com.hyyercode.spring.appointmenthero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.jdbc.Sql;

@SpringBootApplication
@Sql(value = "/data.sql")
public class AppointmentHero {

	public static void main(String[] args) {
		SpringApplication.run(AppointmentHero.class, args);
	}

}
