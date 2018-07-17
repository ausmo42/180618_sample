package com.revature.service;

import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;

import com.revature.beans.BUser;
import com.revature.dao.UserDaoImpl;

public class JacksonService {
	
	public static String selectAllUserJSON() {
		
		List<BUser> users = new UserDaoImpl().selectAll();
		ObjectMapper mapper = new ObjectMapper();
		
		String json = null;
		
		try {
			json = mapper.writeValueAsString(users);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return json;
	}
}
