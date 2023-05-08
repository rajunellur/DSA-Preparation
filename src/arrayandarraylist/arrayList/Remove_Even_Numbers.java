package arrayandarraylist.arrayList;

import java.util.ArrayList;

public class Remove_Even_Numbers {
    public static void RemoveEven(ArrayList<Integer> list){
        for(int i=list.size()-1; i>=0; i-- ){
            if(list.get(i) % 2 == 0){
                list.remove(i);
            }
        }
        System.out.println("Array list after removing even numbers: "+list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(8);
        list.add(7);
        list.add(4);
        list.add(2);
        list.add(10);
        list.add(1);
        System.out.println("Array list Before removing even numbers: "+ list);
        RemoveEven(list);
    }
}
