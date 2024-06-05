import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        int l=0;
        boolean f=false;
        for (char ch:s.toCharArray())
        {
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        for(int fr:h.values())
        {
            if(fr%2==0)
            {
                l+=fr;
            }
            else
            {
                l+=fr-1;
                f=true;
            }
        }
        return f ==true?l+1:l;
    }
}