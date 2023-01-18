package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ShoesRepo extends JpaRepository<Shoes, Integer>{

	public void deleteById(Shoes s);

}
