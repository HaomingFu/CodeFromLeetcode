public class Solution {
    public int reverse(int x) {
        if (x == 0) return x;
        int sign = 1;
        if (x < 0){ 
            x = -x; 
            sign = -1; 
        }       
        String res = ""; 
        while ( x > 0) {
            res += x % 10; 
            x = x / 10; 
        }       
        int ix = 0;
        while ( res.charAt(ix) == \u00270\u0027)
            ix++;
        res = res.substring(ix);
                
        if (sign < 0)
            res = "-" + res;
        try{ 
            return Integer.parseInt(res);                                                                                                                                                 
        }catch (NumberFormatException exc){
            return 0;
        }       
                
                
                
    }           

}