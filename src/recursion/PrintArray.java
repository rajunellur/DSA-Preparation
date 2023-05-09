package recursion;

public class PrintArray {
    public static void print(int[] arr, int i){
        if(i==arr.length){
            return;
        }
        System.out.println(arr[i]);
        print(arr,i+1);
    }
    public static void main(String[] args) {
        int[] arr = {12,23,45,78,36,81};
        int i=0;
        print(arr,i);
    }
}
