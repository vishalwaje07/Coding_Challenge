package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	
	private UserRepository userRepository;
	
	// Get Request
	// Post Request
	// Put Request
	// Delete Request

}
