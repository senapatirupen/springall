package com.exspring.demo.service;

import com.exspring.demo.entity.User;

public interface UserManagmentService {

	User save(User user);

	User findById(Long id);

}
