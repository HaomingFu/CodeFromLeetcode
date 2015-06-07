public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0){
            res += (res >>> 1) \u0026 1;
            res >>>= 1;
        }
        return res;
    }
}