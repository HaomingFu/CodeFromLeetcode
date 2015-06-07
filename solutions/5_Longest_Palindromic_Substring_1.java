public class Solution {
    public String longestPalindrome(String s) {
        int maxLen = 0;
        String result="";
        for(int i = 0; i < s.length();i++){
            if(maxLen < expandString(s, i, i).length()){
                result = expandString(s,i, i); 
                maxLen = result.length();
            }   
            if(maxLen < expandString(s, i, i+1).length()){
                result = expandString(s, i, i+1);
                maxLen = result.length();
            }   
            
        }   
        return result;
    }
    
    public  String expandString(String s, int i, int j){ 
        while(i >= 0 \u0026\u0026 j< s.length()){
            if (s.charAt(i)==s.charAt(j)){
                i--;j++;
            }else break;
        }   
        return s.substring(i+1, j); 
    }       

}