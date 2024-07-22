package springmvc.controller;



import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home(Model model)
	{			
		System.out.println("This is home url");
		model.addAttribute("name", "Vishal Waje");
		model.addAttribute("id", 1);
		
		List<String> friends = new ArrayList<String>();
		friends.add("Nikhil");
		friends.add("Sarthak");
		friends.add("Ashish");
		friends.add("Prem");
		
		model.addAttribute("f", friends);
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String About()
	{
		System.out.println("This is about us ");
		return "about";
	}
	
	
	@RequestMapping("/help")
	public ModelAndView Help() {
		System.out.println("This is Help page");
		// Creating Model And View Object
		ModelAndView modelAndView = new ModelAndView();
		
		// Setting the data 
		modelAndView.addObject("name", "Vishal");
		modelAndView.addObject("rollNumber", 2);
		LocalDateTime now = LocalDateTime.now();
		
		modelAndView.addObject("time", now);
		

		// Marks
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		modelAndView.addObject("marks", list);
		
		// Setting the view name 
		modelAndView.setViewName("help");
		
		
		return modelAndView;
	}
}
