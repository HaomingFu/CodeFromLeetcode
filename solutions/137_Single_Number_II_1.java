public class Solution {
    public int singleNumber(int[] A) {
        int count[]  = new int[32];
        int result = 0;
        
        for(int i = 0; i < 32; ++i){
            for(int x:A){
                if(((x>>i) \u0026 1) == 1)
                    count[i]++;
            }
            result |= ((count[i] % 3) << i);
        }
        return result;
    }
}