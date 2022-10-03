import java.util.*;

class Person{
	private String name,DOB;
	void setName(String name){
		this.name = name;
	}
	void setDOB(int year,int month,int day){
		this.DOB =Integer.toString(day)+"-"+Integer.toString(month)+"-"+Integer.toString(year);
	}
	void getName(){System.out.println("Name is "+name);}
	void getDOB(){System.out.println("DOB is "+DOB);}
}

class CollegeGraduate extends Person{
	private float gpa;
	private	int grad_year;
	CollegeGraduate(String name,int year,int month,int day,float gpa,int grad_year){
		setName(name);
		setDOB(year,month,day);
		this.gpa = gpa;
		this.grad_year = grad_year;
	}

	void getGPA(){System.out.println("GPA is "+gpa);}
	void getGRYR(){System.out.println("Year of Graduation is "+grad_year);}
}

class p1{
	public static void main(String args[]){
		CollegeGraduate cg = new CollegeGraduate("Jithin",2003,04,11,5,2025);
		cg.getName();
		cg.getDOB();
		cg.getGPA();
		cg.getGRYR();
	}
}