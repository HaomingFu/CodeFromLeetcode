public class Solution {
    public String convertToTitle(int n) {
        StringBuilder res = new StringBuilder();
        while (n > 0){
            int re = n % 26;
            n = n / 26;
            if(n != 0 \u0026\u0026 re == 0)
                re = 26;
            res.insert(0, (char)(\u0027A\u0027 + re - 1));
        }
        return res.toString();
        
    }
}