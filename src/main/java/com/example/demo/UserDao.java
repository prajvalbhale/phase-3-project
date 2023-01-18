package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDao {
	
	@Autowired
	UserRepo repo;
	
	public User insert(User u) {
		return repo.save(u);
	}
	
	public List<User> getall(){
		return repo.findAll();
		}

	public User check(User u) {
		// TODO Auto-generated method stub
		return repo.ifExits(u);
	}

}
