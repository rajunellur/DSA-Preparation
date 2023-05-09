package hashmapandhashset.hashset;

import java.util.HashSet;

public class FirstRepeatingCharacter {
    public static void FRC(String s){
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(set.contains(ch)){
                System.out.println("First Repeating character is: "+ch);
                return;
            }else{
                set.add(ch);
            }
        }
        System.out.println(-1);
    }
    public static void main(String[] args) {
        String s = "adcbdednhu";
        FRC(s);
    }
}
        // TC = O(n)
        // SP = O(n)