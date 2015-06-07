public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        
        while( n > 0){
            n--;
            if(n == 0){
                res.insert(0, \u0027A\u0027);
                break;
            }
            int re = n % 26;
            n = n / 26;
            res.insert(0, (char)(re + \u0027A\u0027));
        }
        return res.toString();
        
    }
}