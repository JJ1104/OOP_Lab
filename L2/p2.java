import java.util.Scanner;

class p2{
    public static void main(String args[]){
        int n,i,ele_in,inpos,delpos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = scanner.nextInt();
        int arr[] = new int[10];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        // inserting
        System.out.println("Enter the element and position you want to insert:");
        ele_in  = scanner.nextInt();
        inpos = scanner.nextInt();
        for(i=n;i>inpos-1;i--){
            arr[i] = arr[i-1];
        }
        arr[inpos-1] = ele_in;
        n = n+1;
        System.out.println("After inserting, printing array:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        //deleting
        System.out.println("\nEnter the postion of the element you want to delete:");
        delpos = scanner.nextInt();
        for(i=delpos-1;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        n = n-1;
        System.out.println("After deleting, printing array:");
        for(i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        scanner.close();
    }   

}