package com.springRestApi.RestApi.controller;
import com.springRestApi.RestApi.services.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRestApi.RestApi.entities.User;

@RestController
public class MyController {
	
	@Autowired
	private UserService userService; 
			
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}
	
	//Api-1 : To send all the User's when called.
	@GetMapping("/user")
	public List<User> getUser(){
		return this.userService.getUser();
	}

	//Api 2(a) : To get the data from our User flutter app.
	@PostMapping(path = "/user", consumes = "application/json")
	public User test(@RequestBody User user) {
		return this.userService.addUser(user);
	}

	//Api 2(b) : To get the data from our User flutter app.
	@PostMapping(path = "/user", consumes = "application/x-www-form-urlencoded")
	public User testt(User user) {
	  return this.userService.addUser(user);
	}
	
	//Api 3(a) : To remove the data from our flutter User app and the list.
	@DeleteMapping(path = "/user", consumes = "application/json")
	public User remove(@RequestBody User user) {
		return this.userService.removeUser(user);
	}

	//Api 3(b) : To remove the data from our flutter User app and the list .
	@DeleteMapping(path = "/user", consumes = "application/x-www-form-urlencoded")
	public User removee(@RequestBody User user) {
	  return this.userService.removeUser(user);
	}
	
	@DeleteMapping("/user/{userId}")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable String userId){
	try {
		this.userService.deleteUser(Long.parseLong(userId));
		return new ResponseEntity<>(HttpStatus.OK);
	} catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
		}
	

	
	//Api 3() : To delete the data from out Todo flutter app.

	
	// Below code is for personal refrence.
	
//	@PostMapping(path="/todoAdd",consumes="application/json")
//	@PostMapping("/todoAdd")
//	public Todo addTodo(@RequestBody Todo todo) {
//		return this.todoService.addTodo(todo);
//	}
	
	
//	@RequestMapping(value = "/todoAddd", method = RequestMethod.POST,
//	        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE, 
//	        produces = {MediaType.APPLICATION_JSON_VALUE})
}

//@Autowired
//private DummyService dummyService; 
	
//@GetMapping("/hom")
//public int hom() {
//	return 3;
//}
//
////Get the price from Dummy class
//@GetMapping("/dummycur")
//@ExceptionHandler(RuntimeException.class)
//public List<Currency> getDummyCurrency(){
//	return dum.getCurrency();
//}
