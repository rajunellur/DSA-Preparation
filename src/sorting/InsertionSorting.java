package sorting;

import java.util.Arrays;

public class InsertionSorting {
    static int[] sort(int[] arr){

        int[] sorted_arr = new int[arr.length];
        for(int i=1; i<arr.length; i++){
            int key = arr[i];

            int j = i - 1;
            while(j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        for(int i=0; i<arr.length; i++){
            sorted_arr[i] = arr[i];
        }
        return sorted_arr;
    }
    public static void main(String[] args) {
        int[] arr = {5,3,8,1,7,2,4};
        System.out.println(Arrays.toString(sort(arr)));
    }
}
