package sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
    private static int[] sorting(int[] c, int[] a, int[] b){
                MergeTwoSortedArray.merge(a,b);
        int[] sorted_arr = new int[c.length];
        for(int i=0; i<c.length-1; i++){
            int minval = c[i];
            int minidx = i;
            for(int j=0; j<c.length; j++){
                if(c[i] > c[j]){
                    minval = c[j];
                    minidx = j;
                }
            }
            int temp = c[minidx];
            c[minidx] = c[i];
            c[i] = temp;
        }

        return sorted_arr;
    }
    private static int[] merge(int[] a, int[] b){
        int n = a.length;
        int m = b.length;
        int[] c = new int[n+m];

        for(int i=0; i<n; i++){
            c[i] = a[i];
        }
        for(int i=0; i<m; i++){
            c[n + i] = b[i];
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {1,3,16,20,32};
        int[] b = {8,10,11,14,18};
        int n = a.length; int m = b.length;
        int[] c = new int[n+m];

        //MergeTwoSortedArray.merge(a,b);
        MergeTwoSortedArray.sorting(a,b,c);
//        System.out.println(Arrays.toString(merge(a));
//       System.out.println(Arrays.toString(sorting(merge(b));
    }
}
