import java.util.Scanner;

class p1{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n,i,j,temp;
        System.out.println("Enter the size of array:");
        n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<arr.length;i++)
        {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        
        System.out.println("Sorting in ascending order:");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Sorting in descending order:");
        for(i=0;i<arr.length;i++)
        {
            for(j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
}