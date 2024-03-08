package com.springboot.jpa.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.jpa.learnjpaandhibernate.course.jpa.Course;

@Repository
public class CourseJdbcRepository {
    
	@Autowired
	private JdbcTemplate jdbcTemplate; 
	
	public void insertData(Course course) {
		String Insert_Query = "insert into course(id,name,author) values(?,?,?)";
		int resultInserted = jdbcTemplate.update(Insert_Query,course.getId(),course.getName(),course.getAuthor());
		System.out.println(resultInserted);
	}
	
	public void deleteByID(long id) {
		String Delete_Query = "delete from course where id = ?";
		jdbcTemplate.update(Delete_Query,id);
	}
	
	public Course getCourseByID(long id) {
		String Select_Query="Select * from course where id=?";
		Course course = jdbcTemplate.queryForObject(Select_Query, new BeanPropertyRowMapper<Course>(Course.class) ,id);
		return course;
	}
}
