import java.util.Scanner;

public class p2{
	static int findSum(int n){
		int rem,sum=0,c;

		c=n;
		while(c!=0){
			rem = c%10;
			sum+= rem;
			c = c/10;
		}
		return sum;		
	}	

	public static void main(String args[]){
		int n,sum;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		n = scanner.nextInt();
		sum = findSum(n);
		System.out.printf("The sum of digits is %d",sum);
		scanner.close();
	}
}
