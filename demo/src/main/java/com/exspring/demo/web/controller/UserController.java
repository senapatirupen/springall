package com.exspring.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/user")
public class UserController {

	@RequestMapping(value="/view")
	public String view(){ 
		return "views/user/view";
	}
	
	@RequestMapping(value="/edit")
	public String edit(){ 
		return "views/user/edit";
	}
	
}
