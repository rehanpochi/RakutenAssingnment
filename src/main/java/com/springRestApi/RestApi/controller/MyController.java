package com.springRestApi.RestApi.controller;
import com.springRestApi.RestApi.services.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springRestApi.RestApi.entities.Todo;

@RestController
public class MyController {
	
	@Autowired
	private TodoService todoService; 
			
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}
	
	//Api-1 : To send all the todo's when called.
	@GetMapping("/todo")
	public List<Todo> getTodo(){
		return this.todoService.getTodo();
	}

	//Api 2(a) : To get the data from our Todo flutter app.
	@PostMapping(path = "/todoAddd", consumes = "application/json")
	public Todo test(@RequestBody Todo todo) {
		return this.todoService.addTodo(todo);
	}

	//Api 2(b) : To get the data from our Todo flutter app.
	@PostMapping(path = "/todoAddd", consumes = "application/x-www-form-urlencoded")
	public Todo testt(Todo todo) {
	  return this.todoService.addTodo(todo);
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
