package com.springRestApi.RestApi.services;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;


import com.springRestApi.RestApi.entities.Todo;

@Service
public class TodoServiceImplement implements TodoService {

	List<Todo> list;
	
	public TodoServiceImplement() {
		list=new ArrayList<>();
		list.add(new Todo("Do HomeWork"));
		list.add(new Todo("Bring Groceries"));
		list.add(new Todo("Clean Room"));
	}
	
	@Override
	public List<Todo> getTodo() {
	   // TODO Auto-generated method stub
		return list;
	}
	
	@Override
	public Todo addTodo(Todo todo) {
		list.add(todo); 
		 return todo;
	}

}
