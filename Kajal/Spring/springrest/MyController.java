package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;

@RestController
public class MyController {
	@Autowired
	private CourseService courseService;
	
	@GetMapping("/student")
	public String student() {
	return "this is student page";
	}
	
//get the courses
	@GetMapping("/courses")
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
		
	}
	
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
{
	return this.courseService.getCourse(Long.parseLong(courseId));
}
	
	
}
