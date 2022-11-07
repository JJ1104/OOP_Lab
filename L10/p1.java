
class p1{

    static <T> void swap(T arr[],T ele1,T ele2 ){
        
        int pos1=0,pos2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == ele1)
                pos1 = i;
            else if(arr[i] == ele2)
                pos2 = i;
        }

        T temp;
        temp = arr[pos1];
        arr[pos1] = arr[pos2];
        arr[pos2] = temp;
    }



    public static void main(String args[]){
        Integer arr[] = {1,2,3,4,5};
        swap(arr, 2, 4);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }   
}