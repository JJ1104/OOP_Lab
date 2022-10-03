abstract class Figure{
	int a,b;
	abstract void area();
}

class Rectangle extends Figure{
	Rectangle(int a,int b){
		this.a = a;
		this.b = b;
	}
	void area(){
		System.out.println("The area of the rectangle is "+a*b);
	}
}

class Square extends Figure{
	Square(int a,int b){
		this.a = a;
		this.b = b;
	}
	void area(){
		System.out.println("The area of the square is "+a*b);
	}
}

class Triangle extends Figure{
	Triangle(int a,int b){
		this.a = a;
		this.b = b;
	}
	void area(){
		System.out.println("The area of the triangle is "+ 0.5*a*b);
	}
}

class p3{
	public static void main(String args[]){
		Figure refFigure;
		Rectangle R1 = new Rectangle(5,6);
		refFigure = R1;
		refFigure.area();
		Square S1 = new Square(5,5);
		refFigure = S1;
		refFigure.area();
		Triangle T1 = new Triangle(6,2);	
		refFigure = T1;
		refFigure.area();	
	}
}