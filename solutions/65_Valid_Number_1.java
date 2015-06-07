public class Solution {
    public boolean isNumber(String s) {
        s = s.trim().toLowerCase();
        int i = s.indexOf(\u0027e\u0027);
        if (i == -1){
            return isDecimal(s);                                                                                                                                                                           
        }    
        else 
            return isDecimal(s.substring(0, i)) \u0026\u0026 isInteger(s.substring(i+1,s.length() )); 
    }
    
        public static boolean isDecimal(String s) {
        int i=0, n = s.length();
             
        if(i < n \u0026\u0026 (s.charAt(i) == \u0027+\u0027 || s.charAt(i) == \u0027-\u0027)) i++;
        boolean isDecimal = false;
             
        while(i < n \u0026\u0026 Character.isDigit(s.charAt(i))){
            isDecimal = true;
            i++;
        }    
        if (i < n \u0026\u0026 s.charAt(i) == \u0027.\u0027){
            i++;
            while( i < n \u0026\u0026 Character.isDigit(s.charAt(i))){
                isDecimal = true;
                i++;
            }
        }    
        return i== n \u0026\u0026 isDecimal;
             
    }     
    public static boolean isInteger(String s){
        int i = 0, n = s.length();
        if(i < n \u0026\u0026 (s.charAt(i) == \u0027+\u0027 || s.charAt(i) == \u0027-\u0027)) i++;
        boolean isInteger = false;
        while (i < n \u0026\u0026 Character.isDigit(s.charAt(i))){
            i++;
            isInteger = true;
        }
        return isInteger \u0026\u0026 i==n;
    }

}