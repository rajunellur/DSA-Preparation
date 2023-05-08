package arrayandarraylist.arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,6,4,10,5};
        int b = 2;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == b){
                System.out.println("1");
                break;
            }else{
                System.out.println("0");
                break;
            }
        }
    }
}
