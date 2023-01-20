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
public class UserController {
	
	@Autowired
	UserDao dao;
	
	
	@RequestMapping("/userpage")
	public ModelAndView displaypage(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("userlogin.jsp");
		return mv;
	}
	


	@RequestMapping("/insertuser")
	public ModelAndView insertControl(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u = new User();
		u.setFname(request.getParameter("fname"));
		u.setLname(request.getParameter("lname"));
		u.setPhono(Long.parseLong(request.getParameter("phono")));
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		User ur = dao.insert(u);
		if(ur!=null)
		{
			String s="SignUp/Login Successful!..";
			mv.addObject("s", s);
			mv.setViewName("usershoesdetails.jsp");
		}
		return mv;
	}
	

	@RequestMapping("/loginuser")
	public ModelAndView logincontrol(HttpServletRequest request,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView();
		User u = new User();
		u.setUsername(request.getParameter("username"));
		u.setPassword(request.getParameter("password"));
		String pass= u.getPassword();
		User ur = dao.check(u);
		if(ur!=null) {
			if(pass.equals(ur)) {
				mv.setViewName("usershoesdetails.jsp");
				
			}
			else {
				String msg="Incorrect password..";
				mv.addObject("msg",msg);
				mv.setViewName("userlogin1.jsp");
			}
		}
		else {
			String msg="Not registered admin!! Try again..";
			mv.addObject("msg",msg);
			mv.setViewName("userlogin1.jsp");
		}
		
		return mv;
	}
	
	@RequestMapping("/getall_usershoesdetails")
	public ModelAndView displayAll(HttpServletRequest request,HttpServletResponse response) {
	
		ModelAndView mv=new ModelAndView();
		List<User> list = dao.getall();
		mv.setViewName("usershoesdetails.jsp");
		mv.addObject("list", list);
		return mv;

}
}
