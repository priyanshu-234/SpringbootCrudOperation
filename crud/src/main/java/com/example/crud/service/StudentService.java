package com.example.crud.service;

import com.example.crud.model.Student;
import java.util.*;

public interface StudentService {
    Student  createuser(Student student);
        
   Student  findbyid(int  id);
  List<Student>    getalluser();
    Student updateuser(int id , Student  student) ;
	  
  void     deleteuserbyid(int  id);
	
}
