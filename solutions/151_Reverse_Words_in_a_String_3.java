public class Solution {
    public String reverseWords(String s) {
        String res = "";                    
        int ix= 0;                          
        while (ix < s.length()){            
            while(ix < s.length() \u0026\u0026 Character.isWhitespace(s.charAt(ix)))
                ix++;                       
            int jx = ix;                    
            while(jx < s.length() \u0026\u0026 !Character.isWhitespace(s.charAt(jx)))
                jx++;                       
            if(jx > ix)                     
                res = s.substring(ix, jx) + " " + res;
            else                            
                return res.trim() ;         
            ix = jx;                        
        }                                   
        return res.trim();                   
    }
}