public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int [] maps = new int[256];
        Arrays.fill(maps, -1);
        int maxLen = 0;
        int lastIndex = 0;
        for(int ix = 0; ix < s.length(); ix++){
            int index = Character.getNumericValue(s.charAt(ix));
            if (maps[index] == -1){
                maps[index] = ix; 
                maxLen = maxLen > ix - lastIndex + 1 ? maxLen : ix - lastIndex + 1;
            }else {
                maxLen = maxLen > ix - maps[index] ? maxLen : ix - maps[index]; 
                lastIndex = maps[index] + 1;                                                                               
                maps[index] = ix; 
            }       
        }           
        return maxLen;
        
    }
}