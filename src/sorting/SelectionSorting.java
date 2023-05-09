package sorting;

import java.util.Arrays;

public class SelectionSorting {
    static int[] sorting(int[] arr){
        int[] sorted_arr = new int[arr.length];

        for(int i=0; i<arr.length-1; i++){
            int minVal = arr[i];
            int minIdx = i;
            for(int j=0; j<arr.length; j++){
                if(arr[j] < arr[i]){
                    minVal = arr[j];
                    minIdx = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for(int i=0; i<arr.length; i++){
            sorted_arr[i] = arr[i];
        }
        return sorted_arr;
    }
    public static void main(String[] args) {
        int[] arr = {2,8,7,6,3,5,1,2};

        System.out.println(Arrays.toString(sorting(arr)));
    }
}
