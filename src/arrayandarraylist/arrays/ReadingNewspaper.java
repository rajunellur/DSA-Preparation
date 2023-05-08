package arrayandarraylist.arrays;

public class ReadingNewspaper {
    public static void main(String[] args) {
        int a = 100;
        int[] b = {15,20,20,15,10,30,45};

        int cur = 0;
        while (true){
            if( a <= b[cur]){
                System.out.println(cur + 1);
                break;
            }
             a -= b[cur];
            cur = (cur+1) % 7;
        }
    }
}
