package com.jpa.test;


import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args );
	
	UserRepository userRepository = context.getBean(UserRepository.class);
	
//	User user = new User();
//	user.setName("Vishal Waje");
//	user.setCity("Pune");
//	user.setStatus("I am Java Programmer");
//	
//	User user1 =userRepository.save(user);
//	System.out.println(user1);
//	
	
	// Creating Objects for user
//	User user1 = new User();
//	user1.setName("Nikhil Hirve");
//	user1.setCity("Ahmednagar");
//	user1.setStatus("I am doing MBA");
//	
//	User user2 = new User();
//	user2.setName("Sarthak Gite");
//	user2.setCity("Ahmednagar");
//	user2.setStatus("I am doing CA");
//	
//	User user3 = new User();
//	user2.setName("Pandurang More");
//	user2.setCity("Pune");
//	user2.setStatus("SQL Developer");
	
	// Saving the single result in the database
//	User resultUser=userRepository.save(user1);
	
	// Saving the multiple objects
//	List<User>users=List.of(user1, user2);
//	Iterable<User> result =userRepository.saveAll(users);
//	
//	result.forEach(user->{
//		System.out.println(user);
//	});
//	System.out.println("Done");
	
	// Updating the user whos id is 52
//	Optional<User>optional=userRepository.findById(52);
//	User user = optional.get();
//	user.setName("Prem Tarte");
//	User result =userRepository.save(user);
//	System.out.println(result);
	
	// How to get your data
	//findById(id) - return optional containing your data
	
//	Iterable<User>itr=userRepository.findAll();
//	Iterator<User> iterator = itr.iterator();
//	while (iterator.hasNext()) {
//		User user = iterator.next();
//		System.out.println(user);
//	}
//	
//	itr.forEach(new Consumer<User>() {
//		@Override
//		public void accept(User t) {
//			System.out.println(t);
//			
//		}
//	});
	
	// By using the lambda Function 
//	itr.forEach(user->System.out.println(user));
	
	// Deleting the user element (One Element)
//	userRepository.deleteById(52);
//	System.out.println("Deleted");
	
	// Deleting the multiple element
//	Iterable<User>allUsers=userRepository.findAll();
//	allUsers.forEach(user->System.out.println(user));
//	userRepository.deleteAll(allUsers);
	
//	List<User>users=userRepository.findByNameAndCity("Vishal", "Pune");
//	users.forEach(e->System.out.println(e));
	
	List<User> allUser = userRepository.getAllUser();
	
	allUser.forEach(e->{
		System.out.println(e);
	});
	System.out.println("..............................");
	
	List<User> userByName = userRepository.getUseByName("Vishal", "Pune");
	userByName.forEach(e->{
		System.out.println(e);
	});
	System.out.println("---------------------------------------");
	userRepository.getUsers().forEach(e->System.err.println(e));
}
}
