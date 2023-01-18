package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoesRestController {
	
	@Autowired
	ShoesDao dao;
	
	@PostMapping("/insert_shoes")
	public Shoes insert(@RequestBody Shoes s) {
		return dao.insert(s);
	}
	
	@GetMapping("/getallshoesdeatails")
	public List<Shoes> getall(){
		return dao.getall();
	}
	
	@PostMapping("/insertall")
	public List<Shoes> insertall(@RequestBody List<Shoes> s){
		return dao.insertall(s);
	}
	
	@DeleteMapping("deletebyid/{id}")
	public String deletebyid(@PathVariable("id") Shoes id) {
		dao.deletebyid(id);
		return "deleted the id value of"+id;
	}
	
	@PutMapping("/update")
	public Shoes updateByName(@RequestBody Shoes s) {
		return dao.updatebyname(s);
	}
	
	

}
