package com.springRestApi.RestApi;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.boot.test.context.SpringBootTest;

import com.springRestApi.RestApi.controller.MyController;
import com.springRestApi.RestApi.services.UserServiceImplement;

@SpringBootTest
class RestApiApplicationTests {
		
	UserServiceImplement userServiceImplement=new UserServiceImplement();
	
	@Test
	void contextLoads() {
	}

	@Test
	void test_getUser() {
		UserServiceImplement user_obj =new UserServiceImplement();
		assertThat(user_obj.getUser().get(0).name).isEqualTo("rehan");
	}
	
	@Test	
	void getUser() {
		//List<Todo> sample=todoServiceImplement.getTodo();
		//List<Todo> sample2=todoServiceImplement.list;
	    assertThat(userServiceImplement.getUser()).isEqualTo(userServiceImplement.list);
		}
	
//	@Test
//	void test_addUser() {
//		assertThat(userServiceImplement.addUser(new User(1,"rehan")).isEqualTo("rehan");
//	}

	//	@Test	
//	void getUserFromController() {
//	MyController myController=new MyController();
//		//List<Todo> sample=todoServiceImplement.getTodo();
//		//List<Todo> sample2=todoServiceImplement.list;
//	    assertThat(myController.getUser()).isEqualTo(userServiceImplement.list);
//		}
	
}
