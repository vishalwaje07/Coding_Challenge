package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.User;
import repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	
	private UserRepository userRepository;
	
	// Get Request
	// Post Request
	@PostMapping
	public User createOrUpdateUser(@RequestBody) {
		
	}
	// Put Request
	// Delete Request

}
