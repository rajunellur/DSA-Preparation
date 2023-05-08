package arrayandarraylist.arrays;
import java.util.Scanner;

public class SumMatrix {
    static void matrix_Read(int[][] mat){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<mat.length; i++){
            for (int j=0; j<mat.length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no of cols: ");
        int cols = sc.nextInt();

        int[][] a = new int[rows][cols];
        int[][] b = new int[rows][cols];

        System.out.println("Enter matrix a data:");
        matrix_Read(a);
        System.out.println("Enter matrix b data: ");
        matrix_Read(b);

        int[][] c = new int[rows][cols];

        System.out.println("sum of the matrix a and b is: ");
        for(int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
