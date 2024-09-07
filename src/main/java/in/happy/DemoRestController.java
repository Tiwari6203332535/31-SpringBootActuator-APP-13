package in.happy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {
	@GetMapping("/")
	public String getWelcomeMsg() {
		return "Welcome to india";
	}

}
