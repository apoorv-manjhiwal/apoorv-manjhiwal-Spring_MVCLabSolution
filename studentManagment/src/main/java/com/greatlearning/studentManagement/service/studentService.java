package com.greatlearning.studentManagement.service;
import com.greatlearning.studentManagement.entity.Student;
import java.util.list;

public interface studentService {
	
	public List<Student> findAll();
	public Student findById(int id);
	public void save( Student student);
	public void deleteById(int id);
}
