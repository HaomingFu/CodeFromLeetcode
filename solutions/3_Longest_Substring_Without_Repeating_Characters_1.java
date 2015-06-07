public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] maps = new int[256];
        Arrays.fill(maps, -1);
        int maxLen = 0, lastIndex = 0;
        for(int ix = 0; ix < s.length(); ix++){
            if (maps[s.charAt(ix)] >= lastIndex){
                lastIndex = maps[s.charAt(ix)] + 1;
            }   
            maps[s.charAt(ix)] = ix; 
            maxLen = Math.max(ix - lastIndex + 1, maxLen);
        }                                                                                                                  
        return maxLen;

        
    }
}