package com.course.structure;

public class House extends Building{
	private int beds,baths;
	public void set(int beds,int baths){this.beds = beds;this.baths = baths;}
	public void get()
	{
		System.out.println("The number of beds are "+beds);
		System.out.println("The number of bathrooms are "+baths);
	}

}