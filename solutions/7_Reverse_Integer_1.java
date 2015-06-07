public class Solution {
    public int reverse(int x) {
        if (x == 0) return x;
        int sign = 1;
        String num = String.valueOf(x);
        if (x < 0){ 
            sign = -1; 
            num = num.substring(1);
        }   
        String res = ""; 
        for(int ix= num.length() -1; ix >= 0; ix--)
            res += num.charAt(ix);
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