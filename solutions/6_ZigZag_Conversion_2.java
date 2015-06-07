public class Solution {
    public String convert(String s, int nRows) {
        String [] strArr= new String [nRows];
            
        for (int ix=0; ix < nRows; ix++)
            strArr[ix] = ""; 
            
        int flag = -1;                                                                                                                                                                    
        int index = 0;
        for(int ix = 0; ix < s.length(); ++ix){
            strArr[index] += s.charAt(ix);
            if (index <= 0  | index >= nRows -1) 
                flag = -flag;
            index += flag;
        }   
            
        String res = ""; 
        for(int ix=0; ix < nRows; ix++)
            res += strArr[ix];
            
        return res;
    
    }
}