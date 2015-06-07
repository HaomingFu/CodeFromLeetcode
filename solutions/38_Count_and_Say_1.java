public class Solution {
    public String countAndSay(int n) {
        if( n < 1) return "";
        String res = "1";
        while(n-- > 1){
            res = sayHelper(res);
        }
        return res;
        
    }
    private String sayHelper(String s){
        StringBuilder sb = new StringBuilder();
        int count = 1, ix=1;
        for( ; ix < s.length(); ++ix){
            if(s.charAt(ix) == s.charAt(ix-1))
                count++;
            else{
                sb.append(count);
                sb.append(s.charAt(ix-1));
                count = 1;
            }
        }
        sb.append(count);
        sb.append(s.charAt(ix-1));
        return sb.toString();
    }
}