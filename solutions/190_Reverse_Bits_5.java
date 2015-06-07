public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        long res = 0;
        for(int ix = 0; ix < 32; ++ix){
            res = res << 1 + n \u0026 1;
            n >>= 1;
        }
        return (int)res;
    }
}