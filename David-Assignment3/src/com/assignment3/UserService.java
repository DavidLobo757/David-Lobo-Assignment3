package com.assignment3;

public class UserService {
	
	public User createUser(String username, String password, String name) {
		User user = new User();
		
		user.setUserName(username);
        user.setPassWord(password);
        user.setName(name);
        
		return user;
	}
}
