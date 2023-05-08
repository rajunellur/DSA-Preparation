package arrayandarraylist.arrays;
import java.util.Scanner;
public class MissingNumber {
    static int Missing_Number(int[] arr, int n){
        int sum = 0, sum_arr = 0;
        for(int i=0; i<=n; i++){
            sum += i;
        }
        for(int i=0; i<arr.length; i++){
            sum_arr += arr[i];
        }
        return sum - sum_arr;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value:");
      int n = sc.nextInt();
      int[] arr = new int[n-1];
        System.out.println("Enter array inputs less than = n-1 :");
      for(int i=0; i<n-1; i++){
          arr[i] = sc.nextInt();
      }
        System.out.println("Missing number is : " + Missing_Number(arr,n));
    }
}
