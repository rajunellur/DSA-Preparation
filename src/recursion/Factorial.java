package recursion;

public class Factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }

        int nm1fact = fact(n-1);
        return n * nm1fact;
    }
    public static void main(String[] args) {
        int n = 20;
        System.out.println(fact(n));
    }
}
