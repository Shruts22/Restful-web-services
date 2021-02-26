package com.restfulwebservices.restwebservices.User;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	private static List<User> lstUsers = new ArrayList<>();
	static int Id = 4;
	static {
		lstUsers.add(new User( 1, "Kieran Ball",new Date()));
		lstUsers.add(new User( 2, "Shanaya Bhat",new Date()));
		lstUsers.add(new User( 3, "Leena Kalani",new Date()));
		lstUsers.add(new User( 4, "Rahul Bhat",new Date()));
	}
	
	//Find all users
	public List<User> FindAll(){
		return lstUsers;
	}
	
	//Add user
	public User SaveUser(User objUser) {
		//Setting ID if not set already
		if(objUser.getId() == null)
			objUser.setId(++Id);
		
		lstUsers.add(objUser);
		return objUser;
	}
	
	//Get one user
	public User GetUserById(int Id) {
		for (User user : lstUsers) {
			if(user.getId() == Id)
				return user;
		}
		return null;
	}
}
