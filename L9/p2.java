class NewThread implements Runnable{
    String threadname;
    Thread t;
    int n;
    int sum=0;
    int mat[][];
    NewThread(String name,int n,int mat[][]){
        threadname = name;
        this.mat = mat;
        this.n = n;
        t = new Thread(this,threadname);
        System.out.println("Thread "+threadname);
        t.start();
    }
    public void run(){
        try{
            for(int i =0;i<mat[n].length;i++){
                sum += mat[n][i];
                Thread.sleep(10);
            }
        }
        catch(InterruptedException e){
            System.out.println(threadname+" Exiting");
        }
    }

    int getSum(){
        return sum;
    }
}

class p2{
    public static void main(String args[]){
        int mat[][] ={{1,2,3},{4,5,6}};
        NewThread t1 = new NewThread("ROW1", 0, mat);
        NewThread t2 = new NewThread("ROW2", 1, mat);

        try{
            Thread.sleep(100);
            System.out.println("Sum is "+(t1.getSum()+t2.getSum()));
            
        }
        catch(InterruptedException e){
            System.out.println("Exiting");
        }
        System.out.println("Main Thread Exiting");
    }
}