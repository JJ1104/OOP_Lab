import java.util.Scanner;

public class p1{
	static int largest(int a,int b, int c){
		if(a>b && a>c){
			return a;
		}
		else if(b>a && b>c){
			return b;
		}
		else{
			return c;
		}

	}
	
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		int large;
		System.out.println("Enter the integers: ");
		System.out.println("Enter the first integer: ");
		a = scanner.nextInt();
		System.out.println("Enter the second integer: ");
		b = scanner.nextInt();
		System.out.println("Enter the third integer: ");
		c = scanner.nextInt();
		large = largest(a,b,c);
		System.out.printf("The largest number is %d",large);
		scanner.close();
	}
}