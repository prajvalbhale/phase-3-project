package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class BankDao {
	
	@Autowired
	BankRepo repo;
	
	public Bank insert(Bank b)
	{
		return repo.save(b);
	}
	
	
	public List<Bank> getall() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
}
