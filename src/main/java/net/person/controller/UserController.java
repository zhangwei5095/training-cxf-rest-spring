package net.person.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.person.api.RESTSample;
import net.person.domain.User;
import net.person.domain.Users;

@Controller
public class UserController implements RESTSample{

	@Override
	public String doGet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String doRequest(String param, HttpServletRequest servletRequest,
			HttpServletResponse servletResponse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping("/controller/{id}")
	@ResponseBody
	public User getBean(@PathVariable("id") int id) {
		User user = new User();
		user.setId(id);
		user.setName("Hello中国 :"  + id);
		user.setEmail("2008dreams@2008.sina.com");
		return user;
	}

	@Override
	public Users getList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User postData(User user) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User putData(int id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		
	}

}
