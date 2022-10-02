package com.springRestApi.RestApi.controller;
import com.springRestApi.RestApi.services.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	//Get the todo's
	@GetMapping("/todo")
	public List<Todo> getTodo(){
		return this.todoService.getTodo();
	}
	
//	@PostMapping(path="/todoAdd",consumes="application/json")
	@PostMapping("/todoAdd")
	public Todo addTodo(@RequestBody Todo todo) {
		return this.todoService.addTodo(todo);
	}
		
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
