public class Solution {
    public int strStr(String hayStack, String needle) {
        if (hayStack.length() == needle.length() \u0026\u0026 hayStack.compareTo(needle)==0)
            return 0
        else if (hayStack.length() == 0 | needle.length() == 0 | hayStack.length() < needle.length())
            return -1; 
                
        for(int ix = 0; ix < hayStack.length() - needle.length(); ix++){
            int jx; 
            for(jx = 0; jx < needle.length(); ++jx){
                if (hayStack.charAt(ix + jx) != needle.charAt(jx))
                    break;
            }   
            if (jx == needle.length() ) 
                return ix; 
        }       
        return -1; 
    }           
}