package com.vertical.sudhir.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vertical.sudhir.demo.repositories.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/")
	public String getUserName(Model model)
	{
		model.addAttribute("name","Sudhir");
		model.addAttribute("email","sudhir@gmail.com");
		model.addAttribute("password","Pass 1");
		model.addAttribute("salary","50000.2");
		
		model.addAttribute("users",userRepository.findAll());
		
		   return "user/ShowUser";
	}
}
