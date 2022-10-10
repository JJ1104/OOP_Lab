package com.course.structure;

public class Building{
	private int area,stories;
	public void setBuild(int area,int stories){this.area = area;this.stories = stories;}
	public void getBuild(){System.out.println("The area is "+area); System.out.println("The number of stories are "+stories);}
}
