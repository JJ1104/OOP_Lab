package myPackages.p1;

public class Maximum{
    public static int max(int a,int b,int c){
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
    public static float max(float a,float b,float c){
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else
            return c;
    }
    public static int max(int arr[]){
        int largest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest)
                largest = arr[i];
        }
        return largest;
    }
    public static int max(int arr[][]){
        int largest = arr[0][0];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > largest)
                    largest = arr[i][j];
            }
        }
        return largest;
    }
}
