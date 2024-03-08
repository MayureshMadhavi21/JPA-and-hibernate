package com.springboot.jpa.learnjpaandhibernate.course.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.jpa.learnjpaandhibernate.course.jpa.Course;

@Component
public class SpringdataJpaCommandLineRunner implements CommandLineRunner{
    
	@Autowired
	private CourseSpringDataJpaRepository courseSpringDataJpaRepository;
	
	public void run(String... args) throws Exception {
		courseSpringDataJpaRepository.save(new Course(1, "learn java", "mayuresh"));
		courseSpringDataJpaRepository.save(new Course(2, "learn javascript", "harry"));
		courseSpringDataJpaRepository.save(new Course(3, "learn adv java", "durgesh"));
		courseSpringDataJpaRepository.deleteById(1l);
		System.out.println(courseSpringDataJpaRepository.findById(2l));
		System.out.println(courseSpringDataJpaRepository.findById(3l));
		
		System.out.println(courseSpringDataJpaRepository.findAll());
		System.out.println(courseSpringDataJpaRepository.count()); 
		System.out.println(courseSpringDataJpaRepository.findByAuthor("durgesh")); 
	}
}
