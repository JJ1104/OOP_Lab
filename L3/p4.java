import java.util.Scanner;

class Stack{
    int arr[];
    int top;
    int length;

    Stack(int size){
        arr = new int[size];
        length = size;
        top = -1;
    }

    boolean isEmpty(){
        if(top == -1 ){
            return true;
        }
        return false;
    }

    void push(int x){
        if(top == length-1){
            System.out.println("Overflow!! Cannot push");
        }
        else{
            arr[++top] = x;
        }
    }

    int pop(){
        if(isEmpty()){
            return -1;
        }
        System.out.println("After Popping:");
        return arr[top--];  
    }

    void display() {
        int i;
        if(isEmpty()){
            System.out.println("Stack is empty!!");
        }
        else{
            System.out.println("Displaying Stack");
            for (i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            } 
            System.out.println(); 
        }
        
      }
}

class p4{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n,choice,ele;
        boolean exit = false;
        System.out.println("Enter the size of stack");
        n = scanner.nextInt();
        Stack s = new Stack(n);
        while(!exit){
            System.out.println("Enter your choice");
            System.out.println("1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.println("Enter the element to push:");
                ele = scanner.nextInt();
                s.push(ele);
            }
            else if(choice == 2){
                ele = s.pop();
                if(ele == -1){
                    System.out.println("Underflow!! Cannot pop");
                }
                else{
                    System.out.println(ele);
                }
            }
            else if(choice == 3){
                s.display();
            }
            else if(choice == 4){
                System.out.println("Exiting !!");
                exit = true;
            }
            else{
                System.out.println("Invalid Choice");
            }
        }

    }
}