class Student{
	String name;
	int id;
}

class Sports extends Student{
	char s_grade;
}

class Exam extends Student{
	char e_grade;
}

interface SportExam{
	Sports s = new Sports();
	Exam e = new Exam();
}

class Results implements SportExam{
	String final_result;
	void display(){
		System.out.println("The final result is "+final_result);
	}
}

