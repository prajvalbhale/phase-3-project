package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankRestController {

	@Autowired
	BankDao dao;
	
	@PostMapping("/insertbank")
	public Bank insert(@RequestBody Bank b) {
		return dao.insert(b);
	}
	
	@GetMapping("getall_bank")
	public List<Bank> getall(){
		return dao.getall();
	}
}
