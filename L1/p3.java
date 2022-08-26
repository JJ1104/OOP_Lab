import java.util.Scanner;

public class p3{
	static int fact(int n){
		int i,fact = 1;
		for(i=1;i<=n;i++)
		{
			fact = fact*i;	
		}
		return fact;
	}
	public static void main(String[] args){
		int n,r;
		double perm,permd,permn;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the n and r values for finding nCr:");
		n = scanner.nextInt();
		r = scanner.nextInt();
		permn = fact(n);
		permd = (fact(n-r) * fact(r));
		perm = permn/permd;

		System.out.printf("The nCr value for n = %d and r = %d is %f",n,r,perm);
		scanner.close();

	}
}