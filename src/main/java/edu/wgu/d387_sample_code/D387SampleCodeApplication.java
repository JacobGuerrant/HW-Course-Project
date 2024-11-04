package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.i18n.DisplayMessage;
import java.util.Locale;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		DisplayMessage displayMessage = new DisplayMessage();

		// Create US thread
		Thread threadUS = new Thread(() -> {
			Locale locale = Locale.US;
			String message = displayMessage.getWelcomeMessage(locale);
			System.out.println("US Thread: " + message);
		});

		// Create FR thread
		Thread threadFR = new Thread(() -> {
			Locale locale = Locale.CANADA_FRENCH;
			String message = displayMessage.getWelcomeMessage(locale);
			System.out.println("FR Thread: " + message);
		});

		threadUS.start();
		threadFR.start();
	}

}
