package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	public Admin ifExits(Admin a);

	

}
