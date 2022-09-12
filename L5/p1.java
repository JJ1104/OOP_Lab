import java.util.*;

class Student{
	int reg_no;
	String name;
	GregorianCalendar doj;
	short sem;
	float gpa,cgpa;

	Student(){
		reg_no = 2201;
		name = "default";
		doj = new GregorianCalendar(2022,9,12);
		sem = 1;
		gpa = 0.0F;
		cgpa = 0.0F;
	}
	Student(String iname,int j_stu_no,int year,int month,int dayofmonth,short isem,float igpa,float icgpa){
		reg_no = 1000*(year%100)+10*(j_stu_no%10)+(j_stu_no/10);
		name = iname;
		doj = new GregorianCalendar(year,month,dayofmonth);
		sem = isem;
		gpa = igpa;
		cgpa = icgpa;
	}

	void display(){
		System.out.println("Registration Number: "+reg_no);
		System.out.println("Full Name: "+name);
		System.out.println("Date of Joining: "+doj.get(Calender.DATE)+"/"=doj.get(Calender.MONTH)+"/"+doj.get(Calender.YEAR));
		System.out.println("Semester: "+sem);
		System.out.println("GPA: "+gpa);
		System.out.println("CGPA: "+cgpa);
	}
}

class p1{
	public static void main(String args[]){
		int i;
		String name;
		int year, month, dayofmonth ,jstu;
		short sem;
		float gpa,cgpa;
		Scanner scanner = new Scanner(System.in);
		Student starr[] = new Student[5];
		for(i=0;i<5;i++){
			System.out.println("Enter the name of student:");
			name = scanner.next();
			System.out.println("Enter the joining student number:");
			jstu = scanner.nextInt();
			System.out.println("Enter the date of joining:");
			year = scanner.nextInt();
			month = scanner.nextInt();
			dayofmonth = scanner.nextInt();
			System.out.println("Enter the semester: ");
			sem = scanner.nextShort();
			System.out.println("Enter the gpa and cgpa:");
			gpa = scanner.nextFloat();
			cgpa = scanner.nextFloat();
			starr[i] = new Student(name,jstu,year,month,dayofmonth,sem,gpa,cgpa);
		}

		for(i=0;i<5;i++){
			starr[i].display();
		}
	}
}