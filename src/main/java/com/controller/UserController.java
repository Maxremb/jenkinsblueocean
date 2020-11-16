package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entities.User;
import com.service.UserService;

@RestController
@RequestMapping(value = "/rest-user")
@CrossOrigin(allowCredentials = "true", origins = "http://localhost:4200")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping(value = "/user")
	public User saveUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@PutMapping(value = "/user")
	public User updateUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@DeleteMapping(value = "/user/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userService.deleteUser(id);
	}

	@GetMapping(value = "/user/{id}")
	public User findUser(@PathVariable("id") Long id) {
		return userService.findUserById(id);
	}

	@GetMapping(value = "/users")
	public List<User> findUser() {
		return userService.findAllUser();
	}
}
