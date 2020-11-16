package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.User;
import com.repository.UserRepository;
import com.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository uRepo;
	
	@Override
	public User addUser(User user) {
		return uRepo.save(user);
	}

	@Override
	public void deleteUser(Long id) {
		uRepo.deleteById(id);
		
	}

	@Override
	public User findUserById(Long id) {
		return uRepo.findById(id).get();
	}

	@Override
	public List<User> findAllUser() {
		return uRepo.findAll();
	}

}
