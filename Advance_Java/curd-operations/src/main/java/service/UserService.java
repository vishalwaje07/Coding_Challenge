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
	
	// Create or update user 
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	// Get All user
	public List<User> getAllUsers() {
        return userRepository.findAll();
    }
	
	// Get a user by Id
	public Optional<User> getUserById(Long id){
		return userRepository.findById(id);
		
	}
	
	// Delete User by id
	public void deleteUser (Long id) {
		userRepository.deleteById(id);
	}

	
	

}
