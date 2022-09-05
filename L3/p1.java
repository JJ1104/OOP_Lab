class Complex{
	int a;
	int b;

	void setComplex(int x,int y){
		a = x;
		b = y;
	}

	void displayComplex(){
		System.out.println(a+"+"+b+"i");
	}

	Complex addComplex(Complex x, Complex y ){
		Complex result = new Complex();
		System.out.println("Adding Complex:");
		result.a = x.a + y.a;
		result.b = x.b + y.b;
		return result;
	}
	Complex subtractComplex(Complex x, Complex y ){
		Complex result = new Complex();
		System.out.println("Subtracting Complex:");
		result.a = x.a - y.a;
		result.b = x.b - y.b;
		return result;
	}
}


class p1{
	public static void main(String args[]){
		Complex c1 = new Complex();
		Complex c2 = new Complex();
		Complex result = new Complex();
		c1.setComplex(3,2);
		c2.setComplex(2,1);
		c1.displayComplex();
		c2.displayComplex();
		result = result.addComplex(c1,c2);
		result.displayComplex();
		result = result.subtractComplex(c1,c2);
		result.displayComplex();

	}
}