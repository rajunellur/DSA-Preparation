package arrayandarraylist.arrayList;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
//    public static List<Integer> compare(ArrayList<Integer> a, ArrayList<Integer> b){
//        ArrayList<Integer> ans = new ArrayList<>();
//
//        int count1 = 0; int count2 = 0; int count3 = 0;
//        int i=0; int j=0;
//        while (a.get(i) <= b.get(j)){
//                if(a.get(i) > b.get(j)){
//                    count1++;
//                } else if (b.get(j) > a.get(i)) {
//                    count2++;
//                } else if (a.get(i) == b.get(j)) {
//                    count3 = 0;
//                }
//                i++; j++;
//        }
//        ans.add(count1); ans.add(count2);
//        return ans;
//    }
    public static List<Integer> compare(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> ans = new ArrayList<>();

        int count1 = 0; int count2 = 0; int count3 = 0;
        for(int i=0; i<a.size(); i++){
                if(a.get(i) > b.get(i)){
                    count1++;
                } else if (b.get(i) > a.get(i)) {
                    count2++;
                } else if (a.get(i) == b.get(i)) {
                    count3 = 0;
                }
        }
        ans.add(count1); ans.add(count2);
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(5); a.add(6); a.add(7);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(3); b.add(6); b.add(10);

        System.out.println(compare(a,b));
    }
}
