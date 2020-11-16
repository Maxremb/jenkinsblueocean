package com.service;

import java.util.List;

import com.entities.User;

public interface UserService {
	
	public User addUser(User user);
	
	public void deleteUser(Long id);
	
	public User findUserById(Long id);
	
	public List<User> findAllUser();

}
