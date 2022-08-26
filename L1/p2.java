import java.util.Scanner;

public class p2{
	public static void main(String[] args){
		int a,b,c;
		int option;
		double r1,r2,disc,re,img1,img2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a,b,c in the form aX^2+bX+c");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		disc = (b*b) - (4*a*c);
		if(disc>0){
			option = 1;
		}
		else if(disc == 0){
			option = 0;
		}
		else{
			option = 2;
		}

		switch(option){
		case 0:
			r1 = (-b)/(2*a);
			// r1=r2
			System.out.printf("Roots are real and equal: %f %f",r1,r1);
			break;
		case 1:
			r1 = ((-b) + (Math.sqrt(disc)))/(2*a);
			r2 = ((-b) - (Math.sqrt(disc)))/(2*a);
			System.out.printf("Roots are real and distinct: %f %f",r1,r2);
			break;
		case 2:
			re = (-b)/(2*a);
			img1 = ((Math.sqrt(Math.abs(disc)))/(2*a));
			img2 = -((Math.sqrt(Math.abs(disc)))/(2*a));
			System.out.printf("Roots are imaginary(Real Part): %f\n",re);
			System.out.printf("Roots are imaginary(Imaginary Part): %f %f",img1,img2);
			break;

		}
		scanner.close();

	}
}