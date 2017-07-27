package com.springapp.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@RequestMapping(method=RequestMethod.GET)
	public String studentdata(Model model){
		Student student = new Student();
		model.addAttribute("student",student);
		model.addAttribute("message", "Welcome... to the worl of svnsiva");
		return "student-login";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String postStudentData(@Valid @ModelAttribute Student student, BindingResult result, Model model){
		System.out.println("hello");
		if(result.hasErrors()){
			return "student-login";
		}
		model.addAttribute("message", "hey welcome to success page");
		return "success";
	}
	
}
