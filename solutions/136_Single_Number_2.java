public class Solution {
    public int singleNumber(int[] A) {
        int num;
        for (int x :A)
            num ^= x;
        return num;
    }
}