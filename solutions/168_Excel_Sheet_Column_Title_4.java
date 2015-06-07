public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0){
            if(n == 26)
                res.insert(0, \u0027Z\u0027);
                break;
            else{
                int re = n % 26;
                 n = n / 26;
                 res.insert(0, (char)(\u0027A\u0027 + re - 1));
            }
        }
        return res.toString();
        
    }
}