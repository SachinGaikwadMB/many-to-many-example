package com.mb.api.runners;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.Student;
import com.mb.api.persistance.repository.CourseRepository;
import com.mb.api.persistance.repository.StudentRepository;

@Component
public class StudentTestRunner implements CommandLineRunner
{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void run(String... args) throws Exception
	{
		Student student = new Student();
		
		student.setFirstName("Rushi");
		student.setLastName("Bhagavat");
		student.setMobileNumber("7038862215");
		student.setEmail("rushibhagavat1@gmail.com");
		student.setFeees(4000.00);
		student.setCourse(
				Arrays.asList(
						courseRepository.findByCourseId(1),
						courseRepository.findByCourseId(4)
						)
				);
		studentRepository.save(student);

	}

}
