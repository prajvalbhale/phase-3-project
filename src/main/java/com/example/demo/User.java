package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
@Entity
@Data
public class User {
	
	@Id
	private int id;
	private String fname;
	private String lname;
	private long phono;
	private String username;
	private String password;

}
