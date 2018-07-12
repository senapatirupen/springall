package com.exspring.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.exspring.demo.entity.User;
import com.exspring.demo.repository.UserRepository;

@Controller
@RequestMapping(path = "/demo")
public class MainController {
	@Autowired
	private UserRepository userRepository;

	@GetMapping(path = "/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		userRepository.save(user);
		return "saved";
	}
	//http://localhost:8091/demo/add?name=alok&email=alok@gmail.com

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<User> getAllUsers() {
		// this returns a JSON or XML with the users
		return userRepository.findAll();

	}
}