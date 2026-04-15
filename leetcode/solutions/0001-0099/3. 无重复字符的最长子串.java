import java.util.HashSet;
import java.util.Set;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Set<Character> set = new HashSet<>();
        int l = 0, r = 0, n = s.length();
        
        while (r < n) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                r++;
                ans = Math.max(ans, r - l);
            } else {
                set.remove(s.charAt(l));
                l++;
            }
        }
        
        return ans;
    }
}