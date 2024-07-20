package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	
	@RequestMapping("/home")
	public String home()
	{			
		System.out.println("This is home url");
		return "index";
	}
	
	@RequestMapping("/about")
	public String About()
	{
		System.out.println("This is about us ");
		return "about";
	}
}
