package com.csis3275.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.csis3275.model.Student_wva_06;

public class Controller_wva_06 {
	
	public Controller_wva_06() {
		
	}
	
	@GetMapping("/")
	public String renderHome()
	{
		return "index";
		
	}
	
	@GetMapping("/profile")
	public String greetingForm(Model model) {
		model.addAttribute("studentData", new Student_wva_06());
		return "profile";
	}

}
