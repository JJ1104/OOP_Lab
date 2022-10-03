import java.util.*;

class Student{
	int reg_no;
	String name;
	GregorianCalendar doj;
	short sem;
	float gpa,cgpa;
	static int count = 0;
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	// Part - 1
	Student(){
		count++;
		reg_no = 2201;
		name = "default";
		doj = new GregorianCalendar(2022,9,12);
		sem = 1;
		gpa = 0.0F;
		cgpa = 0.0F;
	}
	Student(String iname,GregorianCalendar idoj,short isem,float igpa,float icgpa){
		count++;
		reg_no = 100*(idoj.get(Calendar.YEAR)/100)+count;
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
	// Part - 1
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Part -2
	static void sort(Student starr[],int n){
		int choice;
		Scanner sc = new Scanner(System.in);
		Student temp;
		System.out.println("Enter 1.Sort by semester and CGPA \n2.Sort by name");
		choice = sc.nextInt();
		if(choice == 1){
	        for(int i = 0; i < n-1; i++) {
	            for(int j= 0; j < n-i-1; j++) {
	                if ( starr[j].sem > starr[j+1].sem) {
	                    temp = starr[j];
	                    starr[j] = starr[j+1];
	                    starr[j+1] = temp;
	                }
	                else if (starr[j].sem == starr[j+1].sem) {
	                    if (starr[j].cgpa > starr[j+1].cgpa) {
	                        temp = starr[j];
	                        starr[j] = starr[j+1];
	                        starr[j+1] = temp;
	                    }
	                }
	            }
	        }
		}
		else if(choice == 2){
			for(int i = 0; i < n-1; i++) {
	            for(int j= 0; j < n-i-1; j++) {
	                if (starr[j].name.compareTo(starr[j+1].name)>0) {
	                    temp = starr[j];
	                    starr[j] = starr[j+1];
	                    starr[j+1] = temp;
	                }
	            }
	        }
		}
	}
	// Part - 2
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Part - 3
	//3A
	static void name_char(Student starr[],int n){
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first character:");
		ch = sc.next().charAt(0);
		for(int i=0;i<n;i++){
			if(starr[i].name.charAt(0) == ch){
				starr[i].display();
			}
		}
	}
	//3A
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//3B
	static void name_substr(Student starr[],int n){
		String substr;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the substring to search:");
		substr = sc.nextLine();
		for(int i=0;i<n;i++){
			for(int j=0;j<starr[i].name.length();j++){
				if(starr[i].name.charAt(j) == substr.charAt(i) && starr[i].name.charAt(j+1) == substr.charAt(i+1)){
					starr[i].display();
				}
			}
		}
	}
	/////////////////////////////////////////////////////////////////////////////////////////
	//3C
	static void change_initial(Student starr[],int n){
        int flag=0;
        String temp="";
        char initial=' ';
        String out ="";
        for(int i=0;i<n;i++){
        	for(int j=0;j<starr[i].name.length();j++){
	            if (Character.isUpperCase(starr[i].name.charAt(j))) {
	                flag=1;
	                initial=starr[i].name.charAt(j);
	            }
	            if (flag == 1) {
	                temp = temp + starr[i].name.charAt(j);
	            }
	            if (starr[i].name.charAt(j) == ' ') {
	                flag = 0;
	                out = out + initial + ".";
	                temp="";
	            }
	            if (j == starr[i].name.length()-1) {
	                out = out + temp;
	            }
	        }
        	starr[i].name = out.trim();
        	out="";
        	temp="";
        }
    }
	/////////////////////////////////////////////////////////////////////////////////////////
}

class p123{
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
			starr[i] = new Student(name,cal,sem,gpa,cgpa);
		}
		///////////////////////////
		// Part - 2
		Student.sort(starr,n);
		for(i=0;i<n;i++){
			starr[i].display();
		}
		///////////////////////////
		// Part - 3A
		Student.name_char(starr,n);
		///////////////////////////
		// Part - 3B
		Student.name_substr(starr,n);
		///////////////////////////
		// Part - 3C
		Student.change_initial(starr,n);
		for(i=0;i<n;i++){
			starr[i].display();
		}
		///////////////////////////
	}
}