package com.in30minutes.learn_spring_boot.courses.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.in30minutes.learn_spring_boot.courses.bean.Course;
import com.in30minutes.learn_spring_boot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository ;
	
	//http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return repository.findAll();
		//return Arrays.asList(new Course(1, "learn Rest API", "Kavinder Singh"));
	}
	
	//http://localhost:8080/courses/1
	@GetMapping("/courses/{id}")
	public Course getCourseDetail(@PathVariable long id) {
		Optional<Course> course = repository.findById(id);
		if(course.isEmpty()) {
			throw new RuntimeException("Course not find with id " + id);
		}
		return course.get();
		
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
		
		
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id, @RequestBody Course course) {
		repository.save(course);
		
		
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
		
		
	}
	
}
