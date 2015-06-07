public class Solution {
    public String reverseWords(String s) {
        StringBuilder reversed = new StringBuilder();
        int j = s.length() -1;                                                                                             
        for(int i = s.length() -1; i>= 0; i--){
            if(s.charAt(i) == \u0027 \u0027){
                j = i;
            }else if( i == 0 || s.charAt(i - 1) == \u0027 \u0027) {
                if(reversed.length() != 0)
                    reversed.append(\u0027 \u0027);
                reversed.append(s.substring(i, j));
            }   
        }   
        return reversed.toString();
  
    }
}