package com.example.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.crud.model.Student;
import com.example.crud.service.StudentService;
import  java.util.*;
@RestController
@RequestMapping("/user")
public class StudentController {
	@Autowired 
	private  StudentService  uservice;
	@PostMapping
	public  Student  createuser(@RequestBody  Student  student) {
		return uservice.createuser(student);
		
	}
	@GetMapping("/{id}")
	public  Student findbyId(@PathVariable  int id ) {
		return  uservice.findbyid(id);
	}

	@GetMapping
	public  List<Student>  getalluser() {
		return  uservice.getalluser();
		
	}
	@PutMapping("/{id}")
	public  Student  updateuser(@PathVariable int  id ,@RequestBody Student  student) {
		return uservice.updateuser(id, student);
	}
	@DeleteMapping("/{id}") 
	public  String  deleteuserbyid(@PathVariable int id) {
	uservice.deleteuserbyid(id);
	 return "User with id " + id + " deleted successfully.";
	}
}
