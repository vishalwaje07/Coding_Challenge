package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entity.User;
import service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	 private UserService userService;
	
	@PostMapping
	public User createOrUpdateUser(@RequestBody User user) {
		return userService.saveUser(user);
	}
	
	// Get all users 
	@GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
	
	// Get user by id 
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
		return userService.getUserById(id).orElse(null);
	}
	
	// Delete User
	@DeleteMapping("/{id}")
	public Long deleteUser(@PathVariable Long id) {
		userService.deleteUser(id);
		return id;
	}
	
}
