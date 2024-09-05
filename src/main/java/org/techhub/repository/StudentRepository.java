package org.techhub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.techhub.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    //select * from student where name like '%name%';
	List<Student> findByNameContaining(String name);

}
