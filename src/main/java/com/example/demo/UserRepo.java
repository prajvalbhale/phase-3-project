package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{
@Query("select u.password from User u where u.username=?1")
	public User ifExits(User u);

}
