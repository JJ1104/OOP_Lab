import java.util.Scanner;

class Mixer{
	int arr[];

	void accept(){
		int i;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n = scanner.nextInt();
		arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for(i=0;i<n;i++){
			arr[i] = scanner.nextInt();
		}
		
	}
	Mixer mix(Mixer A){
		int i,j=0;
		Mixer result = new Mixer();
		int nele = arr.length + A.arr.length;
		result.arr = new int[nele];
		for(i=0;i<arr.length;i++){
			result.arr[i] = arr[i];
		}
		for(i=arr.length;i<arr.length+A.arr.length;i++){
			result.arr[i] = A.arr[j];
			j++;
		}
		return result;
	}
	void display(){
		int i;
		System.out.println("The elements of the array are:");
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}	
	
}

class p3{
	public static void main(String args[]){
		Mixer result = new Mixer();
		Mixer M1 = new Mixer();
		Mixer M2 = new Mixer();
		M1.accept();
		M1.display();
		M2.accept();
		M2.display();
		result = M1.mix(M2);
		result.display();
	}
}