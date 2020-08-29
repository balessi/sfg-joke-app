package guru.springframework.sfgjokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * 
 * @author bruno <bruno_alessi@yahoo.com.br>
 * @since 2020-08-29
 */
//@Configuration //comment if you are going to use xml config, uncomment otherwise
public class ChuckConfiguration {

	@SuppressWarnings("static-method")
	//@Bean //comment if you are going to use xml config, uncomment otherwise
	public ChuckNorrisQuotes chuckNorrisQuotes() {
		return new ChuckNorrisQuotes();
	}
	
}
