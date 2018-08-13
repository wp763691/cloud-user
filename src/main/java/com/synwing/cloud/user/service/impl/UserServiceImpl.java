package com.synwing.cloud.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synwing.cloud.user.model.User;
import com.synwing.cloud.user.mongo.dao.UserDao;
import com.synwing.cloud.user.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    
	/* (非 Javadoc)
	* 
	* 
	* @return
	* @see com.synwing.cloud.user.service.UserService#findAll()
	*/

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	/* (非 Javadoc)
	* 
	* 
	* @param id
	* @return
	* @see com.synwing.cloud.user.service.UserService#getUser(java.lang.Integer)
	*/

	@Override
	public User getUser(Integer id) {
		return userDao.getUser(id);
	}

	
	    /* (非 Javadoc)
	    * 
	    * 
	    * @param user
	    * @see com.synwing.cloud.user.service.UserService#insert(com.synwing.cloud.user.model.User)
	    */
	    
	@Override
	public void insert(User user) {
		userDao.insert(user);		
	}

}
