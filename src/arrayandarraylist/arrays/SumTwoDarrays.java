package arrayandarraylist.arrays;

public class SumTwoDarrays {
    public static void main(String[] args) {
        int[][] A = {
                {2, -2, 7, 3,},
                {-1, -8, 9, 3},
                {0, 7, -5, 1}
        };
        int[][] B = {
                {-8, 0, 2, 3},
                {2, 9, 4, -5},
                {3, -1, 6, 7}
        };
        int[][] C = new int[A.length][B[0].length];

        for(int i=0; i<A.length; i++){
            for(int j=0; j<B.length; j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print((C[i][j] + " "));
            }
            System.out.println();
        }

    }
}
