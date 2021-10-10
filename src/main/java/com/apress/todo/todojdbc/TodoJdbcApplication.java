package com.apress.todo.todojdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.apress.todo"})
public class TodoJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoJdbcApplication.class, args);
	}

}
