package recursion;

public class FirstIndexing {
    public static void printXindex(int[] arr,int i,int x){
        if(i==arr.length){
            return;
        }

        if(arr[i] == x){
            System.out.println(i);
        }else{
            printXindex(arr,i+1,x);
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,2,9,3,4,0};
        int i = 0;
        int x = 3;
        printXindex(arr,i,x);
    }
}
