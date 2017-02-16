package com.sudeera.samplapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/me")
	public String welcome(Model model) {
		model.addAttribute("greeting", "Welcome");
		model.addAttribute("tagline", "Hello Spring MVC");
		//return "welcome";
		return "sample";
	}
}
