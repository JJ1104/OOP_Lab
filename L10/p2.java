import java.util.*;

class Stack<T>{
    List<T> arr;
    int top;

    Stack(int size){
        arr = new ArrayList<T>(size);
        top = -1;
    }

    void push(T ele){
        arr.add(ele);
        top++; 
    }

    T pop(){
        top--;
        return arr.remove(arr.size()-1);
    }

    void display(){
        for(T i:arr){
            System.out.println(i.toString());
        }
    }
}

class Student{
    String name;
    int roll_no;
    int grade;
    
    Student(String name,int roll_no,int grade){
        this.name = name;
        this.roll_no =roll_no;
        this.grade = grade;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" Roll_No: "+this.roll_no+" Grade: "+this.grade;
    }
}

class Employee{
    String name;
    int emp_id;

    Employee(String name,int emp_id){
        this.name = name;
        this.emp_id =emp_id;
    }
    @Override
    public String toString(){
        return "Name: "+this.name+" Emp_Id: "+this.emp_id;
    }
}

class p2{

    public static void main(String args[]){


        Stack<Student> student = new Stack<Student>(5);
        
        Student s1 = new Student("Jithin",45,6);
        Student s2 = new Student("Jithin",45,6);

        student.push(s1);
        student.push(s2); 

        Stack<Employee> empl = new Stack<Employee>(5);
        
        Employee e1 = new Employee("Jithin",45);
        Employee e2 = new Employee("Jithin",45);

        empl.push(e1);
        empl.push(e2);

        empl.display();
        System.out.println();
        student.display();
    }
}