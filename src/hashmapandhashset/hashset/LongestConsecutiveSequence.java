package hashmapandhashset.hashset;

import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static int FindLCS(int[] A){
        int n = A.length;
        int start = 0;
        int ans = Integer.MIN_VALUE;
        HashSet<Integer> Hs = new HashSet<>();
        for(int i=0; i<n; i++){
            Hs.add(A[i]);
        }
        for(int i=0; i<n; i++){
            if(!Hs.contains(A[i]-1)){
                start = A[i];
                int len = 1;
                while(Hs.contains(start+1)){
                    len++;
                    start++;
                }
                ans = Math.max(len,ans);
            }
        }
            return ans;
    }
    public static void main(String[] args) {
        int[] A = {100,1,200,3,2,4};
        System.out.println(FindLCS(A));
    }
}
