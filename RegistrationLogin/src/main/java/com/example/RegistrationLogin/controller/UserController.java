package com.example.RegistrationLogin.controller;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.RegistrationLogin.model.UserDetails;
import com.example.RegistrationLogin.repository.UserRepository;

import jakarta.servlet.http.HttpSession;



@Controller
public class UserController {
	@Autowired
	private UserRepository reno;

	@GetMapping("/")
	public String home() {
		
		return "home";
	}
	@PostMapping("/home")
		public String userReg() {
		
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute UserDetails user, Model model, HttpSession session) {
		System.out.println(user.toString());
		// validate 
//		System.out.println(user.getFname());
//		System.out.println(user.getLname());
//		System.out.println(user.getAddress());
//		System.out.println(user.getEmail());
	reno.save(user);
		 session.setAttribute("message", "Registration successful!");
	
		return "welcome";
		
	}
	@PostMapping("/logout")
	public String userLogout() {
	return "login";
}
	@PostMapping("/login")
	public String userLogin() {
	return "success";
	
}
	@PostMapping("/home1")
    public String home1() {
		
		return "home";
	}
	@PostMapping("/Loginexist")
	public String LoginExist() {
	return "login";
}}
