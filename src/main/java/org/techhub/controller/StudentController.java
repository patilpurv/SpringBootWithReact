package org.techhub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.techhub.Model.Student;
import org.techhub.service.StudentService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class StudentController {
	@Autowired
	StudentService studentservice;
    @PostMapping(value="/SaveStudent")
     public String SaveStudentData(@RequestBody Student student)
    {
   boolean b=studentservice.SaveStudentData(student);
	if(b)
	{
		return "Student Added";
	}
	else
	{
		return "Some Problem is There";
	}
}
@GetMapping(value="/ViewStudent")
public List<Student> getAllDatta()
{
	List<Student> list=studentservice.getAllData();
	return list;
}

@GetMapping("/DeleteStudent/{eid}")
public String DeleteRecord(@PathVariable("eid") Integer id)
{
	boolean b=studentservice.DelStud(id);
	if(b)
	{
		return "Record Deleted";
	}
	else
	{
		return "Record Deleted";
	}
}
@GetMapping(value="/search/{emp}")
public List<Student> getEmployee(@PathVariable("emp") String name)
{
	List<Student> list=studentservice.findByNameContaining(name);
	return list;
	
}
}
