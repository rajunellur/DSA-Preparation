package arrayandarraylist.arrays;

public class FindPairs {
    static boolean pairs(int[] a, int k, int n){
        boolean bool = true;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i] + a[j] == k){
                    return bool;
                }
            }
        }
        return bool = false;
    }
    public static void main(String[] args) {
        int[] a = {3,-2,1,4,3,6,8};
        int k = 10;
        int n = a.length;

        System.out.println(pairs(a,k,n));
    }
}
