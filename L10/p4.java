import java.util.ArrayList;

class p4{
    static void printlist(ArrayList<?> list){
        System.out.println(list);
    }
    public static void main(String args[]){
        ArrayList<Integer> list1 = new ArrayList<Integer>(5);
        ArrayList<Double> list2 = new ArrayList<Double>(5);
        ArrayList<String> list3 = new ArrayList<String>(5);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list2.add(1.0);
        list2.add(2.0);
        list2.add(3.0);
        list3.add("Hello");
        list3.add("Good");
        list3.add("morning");
        printlist(list1);
        printlist(list2);
        printlist(list3);
    }
}