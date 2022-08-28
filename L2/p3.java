import java.util.Scanner;

class p3{
    public static void main(String args[]){
        int n,i,ele,index = -1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of the array:");
        for(i=0;i<n;i++)
        {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the element you want to search for:");
        ele = scanner.nextInt();
        for(i=0;i<arr.length;i++)
        {
            if(ele == arr[i]){
                index = i;
                break;
            }
            else
                index = -1;        
        }
        if(index != -1){
            System.out.println("The element "+ele+" was found at index "+index);
        }
        else{
            System.out.println("The element was not found");
        }
        scanner.close();
    }
}