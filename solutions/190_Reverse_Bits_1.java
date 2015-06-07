public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int res = 0;
        while(n != 0){
            res = res*2 + (n \u0026 1);
            n >>>= 1;
        }
        return res;
    }
}