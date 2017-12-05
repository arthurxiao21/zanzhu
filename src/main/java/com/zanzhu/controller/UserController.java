package com.zanzhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	@RequestMapping("/register")
	public String register(){
		return "register1";
	}
	@RequestMapping("/registerUnion")
	public String registerUnion(){
		return "registerUnion";
	}
	@RequestMapping("/registerCompany")
	public String registerCompany(){
		return "registerCompany";
	}
}
