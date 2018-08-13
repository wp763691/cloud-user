package com.synwing.cloud.user.mongo.dao;

import java.util.List;

import com.synwing.cloud.user.model.User;

public interface UserDao {

	List<User> findAll();

    User getUser(Integer id);

    void insert(User user);

	
}
