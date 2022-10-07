//package com.springRestApi.RestApi.controller;
//import com.springRestApi.RestApi.entities.User;
//import com.springRestApi.RestApi.services.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.springRestApi.RestApi.entities.User;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static org.mockito.Mockito.when;
//
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//
//class MyControllerTest {
//	
//	@Autowired
//	MyController myController =new MyController();
//	
//	@MockBean
//	UserService userService=Mockito.mock(UserService.class);
//	
//	
//	@Autowired
//	UserServiceImplement userServiceImplement=new UserServiceImplement();
////	@MockBean
////	UserServiceImplement userServiceImplement=Mockito.mock(UserServiceImplement.class);
//
//	
////	@Test
////	void getUserTest() {
////		UserServiceImplement userServiceImplement=new UserServiceImplement();
////		List<User> userList;
////		userList=new ArrayList<>();
////		userList.add(new User(1,"rehan"));
////		System.out.print(userServiceImplement.list);
////		MyController myController =new MyController();
////		assertEquals(userList,myController.getUser());
////		}
//	
//	@Test
////	void deleteUserTest() {
////		User user=new User(2,"rizwan");
////		assertEquals().
////		when(userService.addUser(new User(1,"rehan"))).thenReturn(new User(1,"rehan"));
////		UserServiceImplement userServiceImplement=Mockito.mock(UserServiceImplement.class);
////		when(userServiceImplement.getUser()).thenReturn((List<User>) ((1,"rehan")));
//     //(userService.deleteUser(1)).thenReturn(deleteUser(1)));
////		assertEquals(userService.deleteUser(1),userServiceImplement.deleteUser(delteUser(1,"rehan")));
//		assertEquals(userService.deleteUser(1),myController.remove(new User(1,"rehan")));
//	}
//
//}
