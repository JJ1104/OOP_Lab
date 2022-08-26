import java.util.Scanner;

public class p1{
	static boolean isArmstrong(int n){
		int rem,fact=1,i,sum=0,c;
		boolean flag;
		c=n;
		while(c!=0){
			rem = c%10;
			for(i=1;i<=rem;i++){
				fact *= i;
			}
			sum+=fact;
			fact=1;
			c = c/10;
		}
		if(sum == n){
			flag = true;
			return flag;
		}
		else{
			flag = false;
			return flag;
		}	
	}

	public static void main(String args[]){
		int n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check:");
		n = scanner.nextInt();
		if(isArmstrong(n)){
			System.out.println("It is an Armstrong number");
		}
		else{
			System.out.println("It is not an Armstrong number");
		}
		scanner.close();
	}
}