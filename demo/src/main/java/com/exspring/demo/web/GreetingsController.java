package com.exspring.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.exspring.demo.web.model.User;

@Controller
public class GreetingsController {

	@GetMapping("/greetings")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		return "greetings";
	}
	
	@PostMapping("/home")
	public String home(@ModelAttribute User user) {
		return "home";
	}
	
	@GetMapping("/login")
	public String login(@ModelAttribute User user) {
		return "login";
	}
	
	@PostMapping("/login")
	public String welcome(@ModelAttribute User user, Model model) {
		model.addAttribute("name", user.getName());
		return "greetings";
	}
	
	@GetMapping("/register")
	public String register(@ModelAttribute User user) {
		return "register";
	}
	
	@PostMapping("/register")
	public String home(@ModelAttribute User user, Model model) {
		model.addAttribute("name", user.getName());
		return "greetings";
	}
	
	/*@GetMapping("/forgot")
	public String forgot(@ModelAttribute User user) {
		return "forgot";
	}
	
	@GetMapping("/reset")
	public String resetPassword(@ModelAttribute User user) {
		return "reset";
	}
	
	@PostMapping("/reset")
	public String reset(@ModelAttribute User user) {
		return "reset";
	}*/

}