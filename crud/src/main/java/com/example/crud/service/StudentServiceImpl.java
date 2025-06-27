package com.example.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.crud.model.Student;
import com.example.crud.repository.StudentRepository;
import java.util.*;

@Service
public  class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentrepo;

    @Override
    public Student createuser(Student student) {
        return studentrepo.save(student);
    }
    @Override
    public  Student  findbyid(int  id) {
    	return  studentrepo.findById(id).orElse(null);
    	
    }
    
    public  List<Student>   getalluser(){
    	return  studentrepo.findAll();
    	
    }
    public  Student  updateuser(int  id , Student  student) {
    	return  studentrepo.findById(id).map(user->{
    		user.setName(student.getName());
    		user.setSirname(student.getSirname());
    		return  studentrepo.save(user);
    	}).orElse(null);
    }
   public  void    deleteuserbyid(int id) {
	    
	   
	        studentrepo.deleteById(id);
	    
	   
   }
}
