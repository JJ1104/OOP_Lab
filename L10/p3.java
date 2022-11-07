import java.util.*;

class LL<T>{
    LinkedList<T> list;

    LL(){
        list = new LinkedList<T>();
    }

    void InsertLast(T ele){
        list.addLast(ele);
    }

    T DeleteLast(){
        return list.removeLast();
    }

    void display(){
        for(T i:list){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

class p3{
    public static void main(String args[]){
        LL<Integer> intlist = new LL<Integer>();
        intlist.InsertLast(1);
        intlist.InsertLast(2);
        intlist.InsertLast(3);
        System.out.println(intlist.DeleteLast()); 
        intlist.display();
        LL<Double> dolist = new LL<Double>();
        dolist.InsertLast(3.4);
        dolist.InsertLast(1.2);
        dolist.InsertLast(6.2);
        dolist.display();
    }
}