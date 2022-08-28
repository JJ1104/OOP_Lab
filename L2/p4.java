import java.util.Scanner;

class p4{
    public static void main(String args[]){
        int r1,c1,r2,c2,i,j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rows and columns of first matrix");
        r1  = scanner.nextInt();
        c1  = scanner.nextInt();
        System.out.println("Enter the rows and columns of second matrix");
        r2  = scanner.nextInt();
        c2  = scanner.nextInt();
        if(r1!=r2 && c1!=c2){
            System.out.println("The dimensions are incorrect");
            System.out.println("Aborting!!! Cannot perform addition");
        }
        else{
            int first[][] = new int[r1][c1];
            int second[][] = new int[r2][c2];
            int result[][] = new int[r1][c1];
            System.out.println("Enter the elements of the first matrix:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++){
                    first[i][j]  = scanner.nextInt();
                }
            }
            System.out.println("Enter the elements of the second matrix:");
            for(i=0;i<r2;i++)
            {
                for(j=0;j<c2;j++){
                    second[i][j]  = scanner.nextInt();
                }
            }


            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++){
                    result[i][j]  = first[i][j] + second[i][j];
                }
            }
            System.out.println("After adding, printing resultant matrix:");
            for(i=0;i<r1;i++)
            {
                for(j=0;j<c1;j++){
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}