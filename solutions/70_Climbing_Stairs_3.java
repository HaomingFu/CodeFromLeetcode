public class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 0) return 1;
        if(n < 0) return 0;
        int a=1, b = 1;
        int c;
        while( n-- > 1){
            c = a + b;
            a = c;
            b = a;
        }
        return c;
    }
}