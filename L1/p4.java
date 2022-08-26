import java.util.Scanner;

public class p4{
	static boolean isPrime(int n){
		int i;
		boolean flag = true;
		for(i=2;i<n;i++){
			if(n%i == 0){
				flag = false;
				return flag;
			}
		}
		return flag;
	}

	public static void main(String[] args){
		int n,i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the limit:");
		n = scanner.nextInt();
		for(i=2;i<=n;i++){
			if(isPrime(i)){
				System.out.printf("%d ",i);
			}
		}
		scanner.close();
	}
}