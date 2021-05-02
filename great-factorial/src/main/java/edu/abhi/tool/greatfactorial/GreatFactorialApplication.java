package edu.abhi.tool.greatfactorial;

import edu.abhi.tool.greatfactorial.array.ArrayFactorialLauncher;
import edu.abhi.tool.greatfactorial.executor.ExecutorArrayFactorialLauncher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreatFactorialApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GreatFactorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		StringFactorial.main(args);
//		ForkJoinFactorial.main(args);
//		ExecutorArrayFactorialLauncher.main(args);
		ArrayFactorialLauncher.main(args);
	}
}
