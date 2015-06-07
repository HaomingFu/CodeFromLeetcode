public class Solution {
    public boolean isNumber(String s) {
        if(s.compareTo(".") == 0)
            return false;
        s = s.trim();
        int i=0, n = s.length();
            
        if(i < n \u0026\u0026 (s.charAt(i) == \u0027+\u0027 || s.charAt(i) == \u0027-\u0027)) i++;
        int dotNum = 0;
            
        for(; i < n; ++i) {
            if(s.charAt(i) == \u0027.\u0027 \u0026\u0026 dotNum == 0)
                dotNum++;
            else if(s.charAt(i)==\u0027.\u0027 \u0026\u0026 dotNum >= 1)
                return false;
            else if(!Character.isDigit(s.charAt(i)))
                return false;
        }   
        return true;

    }
}