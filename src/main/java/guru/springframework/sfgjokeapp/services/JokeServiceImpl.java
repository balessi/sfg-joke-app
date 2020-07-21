package guru.springframework.sfgjokeapp.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-21
 */
@Service
public class JokeServiceImpl implements JokeService {
	
	private final ChuckNorrisQuotes quotes;
	
	public JokeServiceImpl() {
		super();
		this.quotes = new ChuckNorrisQuotes();
	}

	@Override
	public String getRandomQuote() {
		return this.quotes.getRandomQuote();
	}
	
}
