package com.mb.api.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mb.api.persistance.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>
{
	
	Course findByCourseId(Integer courseId);
}
