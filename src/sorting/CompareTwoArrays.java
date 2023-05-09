package sorting;

import java.util.Arrays;

public class CompareTwoArrays {
    public static void main(String[] args) {
        long[] A = {1, 2, 5, 4, 0};
        long[] B = {2, 4, 5, 0, 1};
        Arrays.parallelSort(A);
        Arrays.parallelSort(B);
        for (int i = 0; i < A.length; i++) {
            if (A[i] != B[i]) {
                System.out.println("0");
                break;
            } else {
                System.out.println("1");
                break;
            }
        }
    }
}
