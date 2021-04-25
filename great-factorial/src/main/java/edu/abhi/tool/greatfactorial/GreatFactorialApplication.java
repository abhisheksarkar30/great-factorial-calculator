package edu.abhi.tool.greatfactorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreatFactorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GreatFactorialApplication.class, args);
	}

	@Override
	public void run(String... args) {
		ForkJoinFactorial.main(args);
//		ArrayFactorial.main(args);
//		StringFactorial.main(args);
	}
}
