package com.durgesh.myapp.SpringRest.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.durgesh.myapp.SpringRest.entities.Course;

@Service
public class CourseServiceimpl implements CourseService {

	List<Course> list;
	public CourseServiceimpl()
	{
		list=new ArrayList<>();
		list.add(new Course(101, "Java Core","Basic Java"));
		list.add(new Course(102, "Python Core","Basic python"));
		
	}
	
	@Override
	public List<Course> getCourses() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Course getCourse(long courseId) {
		// TODO Auto-generated method stub
		Course c=null;
		for(Course course:list)
		{
			if(course.getId()==courseId)
			{
				c=course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		list.add(course);
		return course;
	}

}
