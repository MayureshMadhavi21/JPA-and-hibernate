package com.springboot.jpa.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.jpa.learnjpaandhibernate.course.jpa.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long>{
    
	List<Course> findByAuthor(String author);
	
}
