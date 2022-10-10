class Student{
    int roll_no, marks;
    void getNumber(int roll_no){
        this.roll_no = roll_no;
    }
    void putNumber(){
        System.out.println("Roll No.: "+roll_no);
    }
    void getMarks(int marks){
        this.marks = marks;
    }
    void putMarks(){
        System.out.println("Marks: "+marks);
    }
}

interface Sports{
    double sgrade = 5.1;
    void putGrade();
}

class Result extends Student implements Sports{
    double final_grade;
    public void putGrade(){
        final_grade = ((marks/10) + sgrade)/2;
        System.out.println("The final grade is "+final_grade);
    }
}

class p4{
    public static void main(String args[]){
        Result r1 = new Result();
        r1.getNumber(10);
        r1.getMarks(56);
        r1.putNumber();
        r1.putMarks();
        r1.putGrade();
    }
}