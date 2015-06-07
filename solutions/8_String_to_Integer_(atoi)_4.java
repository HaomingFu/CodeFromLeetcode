public class Solution {
    public int atoi(String str) {
        int i = 0, n = str.length();
            
        while (i < n \u0026\u0026 Character.isWhitespace(str.charAt(i))) i++;
        int sign = 1;
            
        if(i < n \u0026\u0026 str.charAt(i) == \u0027+\u0027) i++;
        else if (i < n \u0026\u0026 str.charAt(i) == \u0027-\u0027){
            sign = -1; 
            i++;
        }   
        int num = 0;
            
        while(i<n \u0026\u0026 Character.isDigit(str.charAt(i))){
            int digit = Character.getNumericValue(str.charAt(i));
            if (num > maxDiv10 || num == maxDiv10 \u0026\u0026 digit >=8 ){
                return sign == 1 ? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }   
            num = num*10 + digit;
            i++;
        }   
            
        return num;
        
    }
}