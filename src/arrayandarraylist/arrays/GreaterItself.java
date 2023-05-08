package arrayandarraylist.arrays;

public class GreaterItself {
    public static void main(String[] args) {
        int[] a = {2,3,10,7,3,2,10,8};
        int n = a.length;
        int max = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            if(max < a[i]){
                max = a[i];
            }
        }
        int count = 0;
        for(int i=0; i<n; i++){
            if(a[i] == max){
                count++;
            }
        }
        System.out.println(n-count);
    }
}
