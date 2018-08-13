
package com.synwing.cloud.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.synwing.cloud.user.model.User;
import com.synwing.cloud.user.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService; 
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable Integer userId){
		return userService.getUser(userId);
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public void addUser(){
		User user = new User();
		user.setAge(25);
		user.setId(1221);
		user.setName("里斯");
		userService.insert(user);
	}

}
