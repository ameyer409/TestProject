package com.skilldistillery.testproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.skilldistillery.testproject.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByUsername(String username);

}
