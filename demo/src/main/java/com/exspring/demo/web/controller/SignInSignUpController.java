package com.exspring.demo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exspring.demo.entity.SignUp;
import com.exspring.demo.service.SignUpService;
import com.exspring.demo.web.model.User;

@Controller
@RequestMapping(value = "/user")
public class SignInSignUpController {

	@Autowired
	SignUpService signUpService;

	@GetMapping("/signIn")
	public String signIn(@ModelAttribute SignUp signUp) {
		return "signIn";
	}

	@PostMapping("/signIn")
	public String welcome(@ModelAttribute SignUp signUp, Model model) {
		Boolean flag = signUpService.signIn(signUp);
		if (flag)
			return "home";
		signUp.setShortDesc("Invalid email id or password");
		return "signIn";
	}

	@GetMapping("/signUp")
	public String register(@ModelAttribute SignUp signUp) {
		return "signUp";
	}

	@PostMapping("/signUp")
	public String home(@ModelAttribute SignUp signUp, Model model) {
		signUpService.save(signUp);
		return "home";
	}

	@GetMapping("/reset")
	public String resetPassword(@ModelAttribute SignUp signUp) {
		return "reset";
	}

	@PostMapping("/reset")
	public String reset(@ModelAttribute SignUp signUp) {
		Boolean flag = signUpService.resetPassword(signUp);
		if (flag)
			return "home";
		signUp.setShortDesc("Invalid email id or password");
		return "signIn";
	}

}
