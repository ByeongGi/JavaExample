package com.java.relation_p28;

import java.util.Vector;

public class Student {
	String name;
	Vector<Course> courses;
	
	
	
	public void registerCourse(Course course){
		courses.add(course);
	}
	public void dropCourse(Course course){
		if (courses.contains(course)) {
			courses.remove(course);
		}
	}
	
	public Vector<Course> getCourses(){
		return courses;
	}
	
	
}
