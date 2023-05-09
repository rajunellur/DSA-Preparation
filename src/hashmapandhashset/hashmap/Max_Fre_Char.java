package hashmapandhashset.hashmap;

import java.util.HashMap;

public class Max_Fre_Char {
    public static void maxFreq(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (freqMap.containsKey(ch) == true) {
                int cfreq = freqMap.get(ch);
                freqMap.put(ch, cfreq + 1);
            } else {
                freqMap.put(ch, 1);
            }
        }

        int maxVal = 0;
        char maxChar = 'a';

        for(char c: freqMap.keySet()){
            if(freqMap.get(c) > maxVal){
                maxVal = freqMap.get(c);
                maxChar = c;
            }
        }
        System.out.println(maxChar);
    }
    public static void main(String[] args) {
        String s = "abacdbadab";
        maxFreq(s);
    }
}
