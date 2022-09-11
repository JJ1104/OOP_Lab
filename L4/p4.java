class Counter{
    static int count = 0;

    Counter(){
        count++;
    }

    static void showCount(){
        System.out.println("The number of objects created are "+count);
    }
}

class p4{
    public static void main(String args[]){
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter.showCount();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        Counter.showCount();
    }
}