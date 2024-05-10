package com.skilldistillery.testproject.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.skilldistillery.testproject.entities.User;
import com.skilldistillery.testproject.repositories.UserRepository;

@Service
public class AuthServiceImpl implements AuthService{
	
	@Autowired
	PasswordEncoder passEnco;
	
	@Autowired
	UserRepository userRepo;

	@Override
	public User register(User user) {
//		String encodedPW = passEnco.encode(user.getPassword());
//		user.setPassword(encodedPW);
//		user.setEnabled(true);
//		user.setRole("standard");
		userRepo.saveAndFlush(user);
		return user;
	}

	@Override
	public User getUserByUsername(String username) {
		return userRepo.findByUsername(username);
	}

}
