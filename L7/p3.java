interface Series{
    int getnext();
    void reset();
    void setstart(int start,int size);
}

class ByTwos implements Series{
    int arr[];
    int start;
    int index = 0;
    
    public int getnext(){
        return arr[++index];
    }

    public void setstart(int start,int size){
        this.start = start;
        this.arr = new int[size];
        arr[0] = start;
        for(int i = 1; i < size; i++){
            arr[i] = arr[i-1] + 2;
        }
    }

    public void reset(){
        this.index = 0;
    }
}

class p3{
    public static void main(String args[]){
        Series s1;
        ByTwos by = new ByTwos();
        s1 = by;
        s1.setstart(4,9);
        System.out.println("Next Element: "+s1.getnext());
        System.out.println("Next Element: "+s1.getnext());
        s1.reset();
        System.out.println("Next Element: "+s1.getnext());
    }
}

