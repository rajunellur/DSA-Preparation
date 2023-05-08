package arrayandarraylist.arrays;
import java.util.Arrays;

public class PrintReverse {
    static int[] reverse(int[] arr){

        /*
        // With extra Space
        int[] rev_arr = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            rev_arr[i] = arr[arr.length-1-i];
        }
        return rev_arr;

         */

        // without extra space
        int i = 0;
        int j = arr.length - 1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr = {2,8,3,5,6};
        System.out.println("Reverse array is: " + Arrays.toString(reverse(arr)));
    }
}
