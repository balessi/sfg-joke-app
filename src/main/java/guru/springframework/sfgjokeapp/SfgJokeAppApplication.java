package guru.springframework.sfgjokeapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-21
 */
@SpringBootApplication
public class SfgJokeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgJokeAppApplication.class, args);
		/*
		try (GenericApplicationContext ctx = 
				(GenericApplicationContext) SpringApplication.run(SfgJokeAppApplication.class, args)) {

			JokeController cntr = (JokeController) ctx.getBean("jokeController");
			System.out.printf("\nJokeController.getRandomQuote() returned: %s\n", cntr.getQuote());
			System.out.printf("\nJokeController.getRandomQuote() returned: %s\n", cntr.getQuote());
			System.out.printf("\nJokeController.getRandomQuote() returned: %s\n", cntr.getQuote());
			System.out.println();
		}
		*/
	}

}
