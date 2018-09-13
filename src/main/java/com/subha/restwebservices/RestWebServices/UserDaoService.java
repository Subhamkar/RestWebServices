package com.subha.restwebservices.RestWebServices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private  static int userCount;
	
	private static ArrayList<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "ALS", new Date()));
		users.add(new User(2, "SUBHA", new Date()));
		users.add(new User(3, "ANNAPRAGADA", new Date()));
	}
	
	public List<User> findAll(){
		
		return users;
	}
	
	public User addUser(User user){
		
		if(user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}
	
	public User getUser(int id){
		for(User user:users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
		
	}
}
