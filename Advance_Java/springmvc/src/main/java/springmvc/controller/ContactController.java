package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;
import springmvc.model.User;

@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String ShowForm() {
		return "contact";
	}
	 @RequestMapping(path="/processform",method = RequestMethod.POST) 
	 public String andleForm(@ModelAttribute User user,Model model) {
		 return "success" ;
	 }
	
		 
}

	/*
	 * @RequestMapping(path="/processform",method = RequestMethod.POST) public
	 * String handleForm(
	 * 
	 * @RequestParam("email")String userEmail,
	 * 
	 * @RequestParam( "userName")String userName,
	 * 
	 * @RequestParam("password")String userPassword, Model model) {
	 * 
	 * User user = new User(); user.setEmail(userEmail); user.setUserName(userName);
	 * user.setPassword(userPassword); System.out.println(user);
	 * 
	 * // Process
	 * 
	 * model.addAttribute("name", userName); model.addAttribute("name", userName);
	 * model.addAttribute("password", userPassword);
	 * 
	 * 
	 * model.addAttribute("user",user); return "success" ; }
	 */
}
