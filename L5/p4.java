import java.util.*;

class p4{
	public static void main(String args[]){
		String str;
		int i,j,n;
		int start = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		str = sc.next();
		n = str.length();
		int count = n%3;
		count = (count == 0)?3:n%3;
		for(i=0;i<n;i++){
			if(start == n){
				break;
			}
			else{
				for(j=0;j<count;j++){
					System.out.print(str.charAt(start));
					start++;
				}
				if(start == n){
					break;
				}
				System.out.print(',');
				count = 3;
			}			
		}
		System.out.println();
	}
}