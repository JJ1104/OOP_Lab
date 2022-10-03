import java.util.*;

class Building{
	private int area,stories;
	void setBuild(int area,int stories){this.area = area;this.stories = stories;}
	void getBuild(){System.out.println("The area is "+area); System.out.println("The number of stories are "+stories);}
}

class House extends Building{
	private int beds,baths;
	void set(int beds,int baths){this.beds = beds;this.baths = baths;}
	void get()
	{
		System.out.println("The number of beds are "+beds);
		System.out.println("The number of bathrooms are "+baths);
	}

}

class School extends Building{
	private int classrooms;
	private String grade_level;
	void set(int classrooms,String grade_level){this.classrooms = classrooms;this.grade_level = grade_level;}

	void get(){
		System.out.println("The number of classrooms "+classrooms);
		System.out.println("The grade level is "+grade_level);
	}
}

class p2{
	public static void main(String args[]){
		House H1 = new House();
		School S1 = new School();
		H1.setBuild(5000,2);
		H1.set(3,2);
		S1.setBuild(8000,5);
		S1.set(10,"Elementary");
		H1.getBuild();
		H1.get();
		S1.getBuild();
		S1.get();	
	}
}