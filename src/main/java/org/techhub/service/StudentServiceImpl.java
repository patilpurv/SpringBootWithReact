package org.techhub.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.techhub.Model.Student;
import org.techhub.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
StudentRepository studentrepository;
	@Override
	public boolean SaveStudentData(Student student) {
		Student s=studentrepository.save(student);
		if(s!=null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public List<Student> getAllData() {
		
		return studentrepository.findAll();
	}
	@Override
	public boolean DelStud(Integer id) {
		Optional<Student> o=studentrepository.findById(id);
		if(o.isPresent()) {
			studentrepository.deleteById(id);
			return true;
		}
		else
		{
			return false;
			
		}
		
	}
	@Override
	public List<Student> findByNameContaining(String name) {
		
		return studentrepository.findByNameContaining(name);
	}

}
