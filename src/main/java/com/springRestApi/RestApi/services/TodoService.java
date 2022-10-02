package com.springRestApi.RestApi.services;

import java.util.List;

import com.springRestApi.RestApi.entities.Todo;

public interface TodoService {
	public List<Todo> getTodo();
	public Todo addTodo(Todo todo);
	}
