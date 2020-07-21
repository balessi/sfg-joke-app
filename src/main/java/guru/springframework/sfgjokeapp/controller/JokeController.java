package guru.springframework.sfgjokeapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import guru.springframework.sfgjokeapp.services.JokeService;

/**
 * 
 * @author Bruno S. Alessi <bruno_alessi@yahoo.com.br>
 * @since 2020-07-21
 */
@Controller
public class JokeController {

	private final JokeService svc;

	public JokeController(JokeService svc1) {
		super();
		this.svc = svc1;
	}
	
	@RequestMapping({"/", ""}) //http://localhost:8080/
	public String showQuote(Model model) {
		model.addAttribute("joke", this.svc.getRandomQuote()); 
		return "chucknorris"; // View Name
	}
	
	public String getQuote() {
		return this.svc.getRandomQuote();
	}
	
}
