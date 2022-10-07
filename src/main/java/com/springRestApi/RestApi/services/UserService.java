package com.springRestApi.RestApi.services;

import java.util.List;

import com.springRestApi.RestApi.entities.User;

public interface UserService {
	public List<User> getUser();
	public User addUser(User user);
	public User removeUser(User user);
//	public void deleteCourse(Long parseLong);
	void deleteUser(long parse);
	}
