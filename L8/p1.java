class OverflowError extends Exception{
	void display(){
		System.out.println("Stack Overflow !");
	}
}

class UnderflowError extends Exception{
	void display(){
		System.out.println("Stack Underflow !");
	}
}

class Stack{
	int stc[];
	int top;
	int size;

	Stack(int size){
		stc = new int[size];
		this.size = size;
		this.top = -1;
	}	

	void push(int ele) throws OverflowError{
		if(top == size-1){
			throw new OverflowError();
		}
		else{
			stc[++top] = ele;
		}
	}

	int pop() throws UnderflowError{
		if(top == -1){
			throw new UnderflowError();
		}
		else{
			return stc[top--];
		}
	}

	void display(){
		for(int i=0;i<top+1;i++){
			System.out.print(stc[i]+" ");
		}
	}
}

class p1{
	public static void main(String args[]){
		Stack s1 = new Stack(2);
		try{
			s1.push(3);
			s1.push(4);
			s1.display();
			s1.push(5);
		}
		catch(OverflowError e){
			e.display();
		}
		try{
			s1.pop();
			s1.pop();
			s1.display();
			s1.pop();
		}
		catch(UnderflowError e){
			e.display();
		}

	}

}