package com.exspring.demo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/address")
public class AddressController {

	@RequestMapping(value="/view")
	public String view(){ 
		return "views/address/view";
	}
	
	@RequestMapping(value="/edit")
	public String edit(){ 
		return "views/address/edit";
	}
}
