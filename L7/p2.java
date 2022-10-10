import myPackages.p1.*;

class p2{
    public static void main(String args[]){
        int m1 = Maximum.max(1,2,3);
        System.out.println("The largest of three integers is "+m1);
        float m2 = Maximum.max(1.3f,2.6f,5.8f);
        System.out.println("The largest of three float is "+m2);
        int arr[] = {4,1,6,9,2,3};
        m1 = Maximum.max(arr);
        System.out.println("The largest no in array is "+m1);
        int mat[][] = {{1,5,2},{1,5,8}};
        m1 = Maximum.max(mat);
        System.out.println("The largest no in matrix is "+m1);
    }
}