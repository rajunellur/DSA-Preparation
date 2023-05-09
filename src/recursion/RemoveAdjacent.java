package recursion;

public class RemoveAdjacent {
    public static String rremove(String s){
        String ansS = "";
      for(int i=0; i<s.length()-1; i++){
          if(s.charAt(i+1) != s.charAt(i)){
              ansS += s.charAt(i);
          }
      }
      return ansS;
    }
    public static void main(String[] args) {
        String s = "geeksforgeeks";
       // int i = 0;
        System.out.println(rremove(s));
    }
}
