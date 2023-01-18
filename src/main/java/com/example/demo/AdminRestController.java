package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminRestController {
	@Autowired
	AdminDao dao;
	
	@PostMapping("/insertadmin")
	public Admin insert(@RequestBody Admin a) {
		return dao.insert(a);
	}
	
	@PostMapping("/insertall")
	public List<Admin> insertall(@RequestBody List<Admin> ad){
		return dao.insertall(ad);
	}
	
	@PostMapping("/deletebyid")
	public void deletebyid(int id) {
		dao.deletebyid(id);
	}

}
