package sorting;

import java.util.Arrays;

public class MergeTwoSortedArray {
    static int[] sorting(int[] a,int[] b,int[] c){
        merge(c);
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
    static int[] merge(int[] a, int[] b){
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

        System.out.println(Arrays.toString(merge(a,b)));
       System.out.println(Arrays.toString(sorting(merge(a,b))));
    }
}
