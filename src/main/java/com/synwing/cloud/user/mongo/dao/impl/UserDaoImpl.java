
/**  
* @Title: UserDaoImpl.java
* @Package com.synwing.cloud.user.mongo.dao.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author jiangliu.wang
* @date 2018年8月10日
* @version V1.0  
 */

package com.synwing.cloud.user.mongo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.synwing.cloud.user.model.User;
import com.synwing.cloud.user.mongo.dao.UserDao;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private MongoTemplate mongoTemplate;

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @return
	 * 
	 * @see com.synwing.cloud.user.mongo.dao.UserDao#findAll()
	 */

	@Override
	public List<User> findAll() {
		return mongoTemplate.findAll(User.class);
	}

	/*
	 * (非 Javadoc)
	 * 
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 * @see com.synwing.cloud.user.mongo.dao.UserDao#getUser(java.lang.Integer)
	 */

	@Override
	public User getUser(Integer id) {
		return mongoTemplate.findOne(new Query(Criteria.where("id").is(id)), User.class);
	}

	
	    /* (非 Javadoc)
	    * 
	    * 
	    * @param user
	    * @see com.synwing.cloud.user.mongo.dao.UserDao#insert(com.synwing.cloud.user.model.User)
	    */
	    
	@Override
	public void insert(User user) {
		mongoTemplate.insert(user);
	}

}
