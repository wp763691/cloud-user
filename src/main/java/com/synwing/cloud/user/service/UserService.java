package com.synwing.cloud.user.service;

import java.util.List;

import com.synwing.cloud.user.model.User;

public interface UserService {

	List<User> findAll();

	User getUser(Integer id);
	
    void insert(User user);
}
