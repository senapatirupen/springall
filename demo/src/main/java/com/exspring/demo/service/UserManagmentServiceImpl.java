package com.exspring.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exspring.demo.entity.User;
import com.exspring.demo.repository.UserRepository;

@Service
public class UserManagmentServiceImpl implements UserManagmentService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User save(User user) {
		User newUser = userRepository.save(user);
		return newUser;
	}

	@Override
	public User findById(Long id) {
		User user = userRepository.getOne(id);
		return user;
	}
	
	public User findUser(User user){
		return null;
	}
}
