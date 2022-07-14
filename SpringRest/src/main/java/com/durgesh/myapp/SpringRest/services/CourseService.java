package com.durgesh.myapp.SpringRest.services;

import java.util.List;

import com.durgesh.myapp.SpringRest.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
	
	public Course getCourse(long courseId);
	
	public Course addCourse(Course course);

}
