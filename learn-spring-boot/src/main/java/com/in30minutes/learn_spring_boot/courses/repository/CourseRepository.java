package com.in30minutes.learn_spring_boot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.in30minutes.learn_spring_boot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
