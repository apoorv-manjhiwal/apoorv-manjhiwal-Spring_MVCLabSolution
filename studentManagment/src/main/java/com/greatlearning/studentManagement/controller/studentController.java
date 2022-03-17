package com.greatlearning.studentManagement.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.beans.factory.annotation.autowired;
import org.springframework.web.bind.annotation.requestMapping;

import com.greatlearning.studentManagement.entity.Student;
import com.greatlearning.studentManagement.service.studentService;

import org.springframework.ui.Model;
@Controller
@requestMapping("/student")
public class studentController {
	
	@autowired
	
	private studentService studentService;
	
	@RequestMappping("/list")
	public String listStudent(Model model) {
		
		List<Student> students = studentService.findAll();
		model.addAttribute("Students", students);
		
		return "list-students";
		
		
	}
	@PostMappping("/save")
	public String listStudent(@RequestParam("id")int id,
			@RequesParam("firstName") String firstName,
			@RequesParam("lastName") String lastName,
			@RequesParam("country") String country,
			@RequesParam("course") String course) {
		
		Student student;
		if(id =!0) {
			student = studentService.findById(id);
			student.setFirstName(firstName);
			student.setCountry(country);
			student.setCourse(course);
			student.setLastName(lastName);
			
		} else {
			student = new Student( firstName, lastName, course, country);
			
		}
		studentService.save(student);
		
		return "redirect:/student/list";
	}
	@RequestMappping("/showFormForAdd")
	public String listStudent(Model model) {
		
		Student student = new student();
		model.addAttribute("student",  student);
		
		return "student-form"; 
		
		
	}
	@RequestMappping("/delete")
	public String deleteStudent(@RequestParam("id")int id) {
		
		studentService.deleteById(id);
		
		return "redirect:/student/list";
		
	}
	@RequestMappping("/showFormForUpdate")
	public String deleteStudent( @RequestParam("id")int id, Model model) {
		
		Student student = studentService.findById(id);
		 
		model.addAttribute("student",  student);
		
		return "student-form";
		
	}

}
