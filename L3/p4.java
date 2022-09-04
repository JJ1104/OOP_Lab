class Stack{
    int arr[];
    int top;
    int capacity;

    Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    boolean isEmpty(){
        if(top == -1 ){
            return true;
        }
        return false;
    }

    void push(int x){
        if(top == capacity-1){
            System.out.println("Overflow!! Cannot push");
            System.exit(1);
        }
        else{
            arr[++top] = x;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Underflow!! Cannot pop");
            System.exit(1);
        }
        System.out.println("After Popping:");
        return arr[top--];
    }

    void display() {
        int i;
        if(isEmpty()){
            System.out.println("Stack is empty!!");
            System.exit(1);
        }
        for (i = 0; i <= top; i++) {
          System.out.print(arr[i] + " ");
        }
      }
}

class p4{
    public static void main(String args[]){
        Stack s = new Stack(5);
        s.push(4);
        s.push(2);
        s.push(1);
        s.push(3);
        s.push(3);
        System.out.println("Popped element "+s.pop());
        s.display();
    }
}