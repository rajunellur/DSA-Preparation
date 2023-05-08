package arrayandarraylist.arrays;
import java.util.Scanner;

public class PrintRows {
    static void matrixRead(int[][] mat){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter no of rows: ");
//        int rows = sc.nextInt();
//        System.out.println("Enter no of columns: ");
//        int cols = sc.nextInt();
//
//        int[][] a = new int[rows][cols];
//
//        System.out.println("Enter matrix a data: ");
//        matrixRead(a);
//
//        // Print rows into columns
        int[][] a = { {1,2,3},
                      {4,5,6},
                      {7,8,9}
        };

        for(int j=0; j<a[0].length; j++){
            for(int i=0; i<a.length; i++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }
}
