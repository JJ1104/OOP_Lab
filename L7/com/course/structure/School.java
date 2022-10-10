package com.course.structure;

public class School extends Building{
	private int classrooms;
	private String grade_level;
	public void set(int classrooms,String grade_level){this.classrooms = classrooms;this.grade_level = grade_level;}

	public void get(){
		System.out.println("The number of classrooms "+classrooms);
		System.out.println("The grade level is "+grade_level);
	}
}