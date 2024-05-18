package io.glitchtech.tollintake;

import java.time.Instant;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.glitchtech.FastPassToll;

@SpringBootApplication
public class TollIntakeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(TollIntakeApplication.class, args);
	}

	//@Bean
	public Consumer<FastPassToll> readTollCharge() {
		return value -> {
			System.out
					.println("Received message for customer " + value.getFastPassId() + " at " + Instant.now());
		};
	}

	@Bean
	public Consumer<FastPassToll> readTollChargeFast() {
		return value -> {
			System.out
					.println("Received message for (FAST) customer " + value.getFastPassId() + " at " + Instant.now());
		};
	}
	@Bean
	public Consumer<FastPassToll> readTollChargeSlow() {
		return value -> {
			System.out
					.println("Received message for (SLOW) customer " + value.getFastPassId() + " at " + Instant.now());
		};
	}
	//@Bean
	public Function<FastPassToll, FastPassToll> processTollChange(){
		return fastPassToll -> {
			System.out.println("Processing message");
			fastPassToll.setStatus("Processed");
			return fastPassToll;
		};
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Listening for messages");

		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
	}

}
