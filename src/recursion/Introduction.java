package recursion;

public class Introduction {
    public static void printIncreasing(int N){
        if(N==0){
            return;
        }
        printIncreasing(N-1);
        System.out.println(N);
    }
    public static void main(String[] args) {
        int N = 9;
        printIncreasing(N);
    }
}
//Jswrmc@2022
