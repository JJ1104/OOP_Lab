import java.util.Scanner;

class p1{
	static boolean isPrime(int n){
		int i;
		if(n == 1){
			return false;
		}
		for(i=2;i<n;i++){
			
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}

	public static void main(String args[]){
		int n,i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		n = scanner.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the elements of the array:");
		for(i=0;i<n;i++){
			arr[i] = scanner.nextInt();
		}
		System.out.println("The prime elements are:");
		for(i=0;i<n;i++){
			if(isPrime(arr[i])){
				System.out.print(arr[i] + " ");
			}
		}
		scanner.close();
	}
}