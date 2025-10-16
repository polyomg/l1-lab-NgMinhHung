package poly.edu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class HelloController {
	@RequestMapping("/poly/hello")
	public String MyHello(Model model) {
		return "poly/hello";
	}
}
