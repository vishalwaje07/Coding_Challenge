package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public String about(Model model) {
		System.out.println("Inside the about...");

		// Putting Data in model
		model.addAttribute("name", "vishal waje".toUpperCase());
		model.addAttribute("currentDate", new Date().toLocaleString());
		// Example
//		String name = "Vishal";
//		name.toUpperCase();

		return "about";
		// about.html
	}

	// This is for Iteration Handeling

	@GetMapping("/example-loop")
	public String iterateHandlar(Model m) {
		// Create a list, set collection...
		List<String> names = List.of("Vishal", "Nikhil", "Sarthak", "Ashish");
		m.addAttribute("names", names);
		return "iterate";
	}

	// This is for Conditional Statements
	@GetMapping("/condition")
	public String conditionalHandlar(Model m) {
		System.out.println("Conditional Handler Executed...");
		m.addAttribute("isActive",false);
		m.addAttribute("gender", "F");
		
		List<Integer> list = List.of(1);
		m.addAttribute("mylist",list);
		
		return "condition";
	}

}
