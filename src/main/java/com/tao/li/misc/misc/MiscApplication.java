package com.tao.li.misc.misc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.tao.li")
public class MiscApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiscApplication.class, args);
	}
}
