package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShoesController {

	@Autowired
	ShoesDao dao;

	

	// INSERTING SHOES CODE
	
	@RequestMapping("/insert_shoes")
	public ModelAndView insertControl(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Shoes s = new Shoes();
		s.setBrand(request.getParameter("brand"));
		s.setName(request.getParameter("name"));
		s.setPrice(Float.parseFloat(request.getParameter("price")));
		Shoes ss = dao.insert(s);
		if (ss != null) {
			mv.setViewName("shoesdetail.jsp");
		} else {
			mv.setViewName("error.jsp");
		}
		return mv;
	}

	 @RequestMapping("/update_shoe") 
	 public ModelAndView update(HttpServletRequest request, HttpServletResponse response) {
		 ModelAndView mv=new ModelAndView();
	     Shoes s = new Shoes();
	  
	    s.setName(request.getParameter("name"));
	  
	  Shoes s1 = dao.updatebyname(s); 
	  if(s1!=null) 
	  { 
		  mv.setViewName("insert_shoes.jsp");
	  } 
	  else 
	  { 
		  mv.setViewName("error.jsp");
		  } 
	  return mv; 
	  }
	 
	@RequestMapping("/delete_shoe")
	public ModelAndView delete(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		Shoes s = new Shoes();
		s.setId(Integer.parseInt(request.getParameter("id")));
		Shoes s2 = dao.deletebyid(s);
		if (s2 != null) {
			mv.setViewName("deleteshoes.jsp");
		} else {
			mv.setViewName("error.jsp");
		}

		return mv;

	}

	@RequestMapping("/getallshoesdeatails")
	public ModelAndView displayAll(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		List<Shoes> list = dao.getall();
		mv.setViewName("shoesdetails.jsp");
		mv.addObject("list", list);
		return mv;
	}

}