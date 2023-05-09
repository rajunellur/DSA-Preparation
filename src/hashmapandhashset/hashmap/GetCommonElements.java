package hashmapandhashset.hashmap;

import java.util.HashMap;


public class GetCommonElements {
    public static void GCE(int[] arr1,int[] arr2){
        HashMap <Integer,Integer>  map = new HashMap<>();
        int count = 0;
        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i],1);
        }
        System.out.print("Common elements are: ");
        for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i])){
                count++;
                System.out.print(arr2[i] + " ");
            }
        }
        System.out.println();
        System.out.println("Numbers of common elements presents are: " + count);
    }
    public static void main(String[] args) {
        int[] arr1 = {2,8,9,5,7,3,6};
        int[] arr2 = {1,7,0,8,6,4,2};
        GCE(arr1,arr2);
    }
}
// TC = O(N)
// SP = O(N)