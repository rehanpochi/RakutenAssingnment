	package com.springRestApi.RestApi.services;
	import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.springRestApi.RestApi.entities.User;

@Service
public class UserServiceImplement implements UserService {

	public List<User> list;
	
	public UserServiceImplement() {
		list=new ArrayList<>();
		list.add(new User(1,"rehan"));
		list.add(new User(2,"rizwan"));
		list.add(new User(3,"imran"));
		System.out.println(list);
	}
	 
	@Override
	public List<User> getUser() {
	   // TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public User addUser(User user) {
		list.add(user); 
		 return user;
	}
	
	@Override
	public User removeUser(User user) {
		list.remove(user); 
		 return user;
	}
	
	@Override
	public void deleteUser(long parseLong) {
		list=this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
	}
}
