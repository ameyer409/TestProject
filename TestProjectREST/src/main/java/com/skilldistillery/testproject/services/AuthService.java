package com.skilldistillery.testproject.services;

import com.skilldistillery.testproject.entities.User;

public interface AuthService {
	
	public User register(User user);
	
	public User getUserByUsername(String username);

}
