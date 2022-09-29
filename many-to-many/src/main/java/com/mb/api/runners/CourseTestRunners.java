package com.mb.api.runners;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import com.mb.api.persistance.entity.Course;
import com.mb.api.persistance.repository.CourseRepository;

//@Component
public class CourseTestRunners implements CommandLineRunner
{

	@Autowired
	private CourseRepository courseRepository;
	
	@Override
	public void run(String... args) throws Exception
	{

		Course course = new Course();
		course.setName("Advanced Java");
		course.setDuration(6);
		course.setCordinator("Durga Sir");
		
		courseRepository.save(course);
		
	}

}
