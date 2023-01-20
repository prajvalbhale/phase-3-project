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
public class AdminController {
	
	@Autowired
	AdminDao dao;
	@ResponseBody
	@RequestMapping("/adminpage")
	public ModelAndView displaypage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("adminlogin.jsp");
		return mv;
	}
    @ResponseBody
	@RequestMapping("/insertadmin")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
	
		Admin a = new Admin();
		a.setUsername(request.getParameter("username"));
		String user=a.getUsername();
		a.setPassword(request.getParameter("password"));
		String pass=a.getPassword();
		Admin ad = dao.check(a);
		if(ad!=null)
		{
			if(pass.equals(ad)) {
				mv.setViewName("adminshoesdetails.jsp");
				
			}
			else {
				String msg="Incorrect password..";
				mv.addObject("msg",msg);
				mv.setViewName("adminlogin1.jsp");
			}
			
		}
		else {
			String msg="Not registered admin!! Try again..";
			mv.addObject("msg",msg);
			mv.setViewName("adminlogin1.jsp");
		}
		return mv;

     }  
	@ResponseBody
	@RequestMapping("/getall_adminshoesdetails")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
	
		ModelAndView mv=new ModelAndView();
		List<Admin> list = dao.getall(); 
		 mv.setViewName("shoesdetails.jsp");
		 mv.addObject("list", list);
		 return mv; 
		 }
	
	
		
	
}
