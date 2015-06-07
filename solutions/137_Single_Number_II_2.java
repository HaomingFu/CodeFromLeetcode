public class Solution {
    public int singleNumber(int[] A) {
        int count[32]  = {0};
        int result = 0;
        
        for(int i = 0; i < 32; ++i){
            for(int x:A){
                if((x>>i) \u0026 1)
                    count[i]++;
            }
            result |= ((count[i] % 3) << i);
        }
        return result;
    }
}