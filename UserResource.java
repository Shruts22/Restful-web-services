package com.restfulwebservices.restwebservices.User;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserResource {
	
	@Autowired
	private UserDaoService service;
	
	//Retrieve all users
	@GetMapping(path = "/Users")
	public List<User> GetAllUsers(){
		return service.FindAll();
	}
	
	//Retrieve user by ID
	@GetMapping(path = "/Users/{id}")
	public User GetUserByid(@PathVariable int id) {
		return service.GetUserById(id);
	}
	
	//Add user
	@PostMapping(path = "/Users/Add")
	public User Adduser(@RequestBody User objUser) {
		service.SaveUser(objUser);
		return objUser;
	}
}
