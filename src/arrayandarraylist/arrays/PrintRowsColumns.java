package arrayandarraylist.arrays;
import java.util.Scanner;
public class PrintRowsColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no of rows: ");
        int row = sc.nextInt();
        System.out.println("enter no of columns: ");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[row][col];

        System.out.println("enter matrix a data: ");
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix a is: ");
        for(int i=0; i<a.length; i++){
            for (int j=0; j<a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

       /// Second matrix
        System.out.println("enter matrix b data: ");
        for(int i=0; i<row; i++){
            for (int j=0; j<col; j++){
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix b is : ");
        for(int i=0; i<b.length; i++){
            for (int j=0; j<b[i].length; j++){
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
 // sum of matrix
        System.out.println();
        int[][] c = new int [row][col];
        System.out.println("sum of the matrix is: ");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
