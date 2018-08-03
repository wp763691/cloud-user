
package com.synwing.cloud.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public Map<String, String> getUser(@PathVariable String userId){
		Map<String, String> userMap = new HashMap<String, String>();
		userMap.put("name", "张三");
		userMap.put("id", "no110");
		return userMap;
	}

}
