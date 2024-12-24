package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.User;
import repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	// Create Users
	
	public User addUserToDB(User user) {
		return userRepository.save(user);
	}
	// Get All Users
	public List<User> getAllUser(){
		return userRepository.findAll();
	}
	
	// Get By ID
	public Optional<User> getUserById(Long id){
		return userRepository.findById(id);
	}
	
	// Delete By ID
	public void deleteUser(Long id) {
		userRepository.deleteById(id);
	}

}
