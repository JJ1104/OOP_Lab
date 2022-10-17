import java.util.*;

class SeatFilledException extends Exception{
    void display(){
        System.out.println("Sorry, the seats are full");
    }
}

class Student{
	int reg_no;
	String name;
	GregorianCalendar doj;
	short sem;
	float gpa,cgpa;
	static int count = 15;
	Student(){
		count++;
		reg_no = 2201;
		name = "default";
		doj = new GregorianCalendar(2022,9,12);
		sem = 1;
		gpa = 0.0F;
		cgpa = 0.0F;
	}
	Student(String iname,GregorianCalendar idoj,short isem,float igpa,float icgpa) throws SeatFilledException{
		count+=5;
		reg_no = 100*(idoj.get(Calendar.YEAR)/100)+count;
        if(reg_no%100 > 25){
            throw new SeatFilledException();
        }
		name = iname;
		doj = idoj;
		sem = isem;
		gpa = igpa;
		cgpa = icgpa;
	}

	void display(){
		System.out.println("Registration Number: "+reg_no);
		System.out.println("Full Name: "+name);
		System.out.println("Date of Joining: "+doj.get(Calendar.DATE)+"/"+doj.get(Calendar.MONTH)+"/"+doj.get(Calendar.YEAR));
		System.out.println("Semester: "+sem);
		System.out.println("GPA: "+gpa);
		System.out.println("CGPA: "+cgpa);
	}
}

class p3{
	public static void main(String args[]){
		int i,n;
		String name;
		int year, month, dayofmonth;
		short sem;
		float gpa,cgpa;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of students:");
		n = scanner.nextInt();
		Student starr[] = new Student[n];
        for(i=0;i<n;i++){
			System.out.println("Enter the name of student:");
			scanner.nextLine();
			name = scanner.nextLine();
			System.out.println("Enter the date of joining(DD/MM/YYYY):");
			dayofmonth = scanner.nextInt();
			month = scanner.nextInt();
			year = scanner.nextInt();
			GregorianCalendar cal = new GregorianCalendar(year,month,dayofmonth);
			System.out.println("Enter the semester: ");
			sem = scanner.nextShort();
			System.out.println("Enter the gpa and cgpa:");
			gpa = scanner.nextFloat();
			cgpa = scanner.nextFloat();
			try{
                starr[i] = new Student(name,cal,sem,gpa,cgpa);
                starr[i].display();
            }
            catch(SeatFilledException e){
                e.display();
            }
		}
    }
}