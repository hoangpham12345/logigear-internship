package com.springboot.springlogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AppController {
	@RequestMapping(value = "/signup")
	public String getSignUpForm() {
		return "signup";
	}

	@RequestMapping(value = "/login")
	public String getLoginForm() {
		return "login";
	}

}
