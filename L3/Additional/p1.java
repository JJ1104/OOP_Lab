import java.util.Scanner;

class ISBN{
	int ISBN_No;

	void chkISBN(){
		int i=1,count = 0,dig,sum=0;
		int num = ISBN_No;
		while(num!=0){
			num /= 10;
			count++;
		}
		num = ISBN_No;
		if(count != 10){
			System.out.println("ISBN should be a 10 digit number");
			System.exit(1);
		}
		else{
			while(num!=0){
				dig = num%10;
				sum += i*dig;
				num /= 10; 
				i++;
			}
			if(sum%11 == 0){
				System.out.println("Legal ISBN");
			}
			else{
				System.out.println("Illegal ISBN");
			}
		}
	}

	void inputISBN(){
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a 10 digit ISBN No");
		temp = scanner.nextInt();
		ISBN_No = temp;
		scanner.close();
	}
}

class p1{
	public static void main(String args[]){
		ISBN n1 = new ISBN();
		n1.inputISBN();
		n1.chkISBN();

	}
}