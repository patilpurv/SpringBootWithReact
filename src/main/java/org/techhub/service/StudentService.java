package org.techhub.service;

import java.util.List;

import org.techhub.Model.Student;

public interface StudentService {

	boolean SaveStudentData(Student student);

	public List<Student> getAllData();

	boolean DelStud(Integer id);

	List<Student> findByNameContaining(String name);

}
