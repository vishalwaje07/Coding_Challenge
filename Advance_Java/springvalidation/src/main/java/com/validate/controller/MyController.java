package com.validate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.validate.entities.LoginData;

@Controller
public class MyController {
	
	@GetMapping("/form")
	public String openForm(Model model) {
		model.addAttribute("loginData", new LoginData());
		return "form";
	}
}
