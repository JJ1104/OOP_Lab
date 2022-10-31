class NewThread extends Thread{
    String threadname;
    int n;
    Thread t;
    NewThread(String threadname,int n){
        this.threadname = threadname;
        this.n = n;
        t = new Thread(this,this.threadname);
        System.out.println("New thread "+ threadname);
        t.start();
    }
    public void run(){
        try{
            for(int i = 1; i<= 10;i++){
                System.out.println(i+"*"+n+": "+i*n);
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e){
            System.out.println(threadname+" interrupted");
        }
        
    }
}

class Table{
    String name;
    int n;
    Table(String name,int n){
        this.name = name;
        this.n = n;
        new NewThread(name,n);
    }
}

class p1{
    public static void main(String args[]){
        new Table("MUL5",5);
        new Table("MUL7",7);

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Exited");
        }
        System.out.println("main thread done");
    }
}