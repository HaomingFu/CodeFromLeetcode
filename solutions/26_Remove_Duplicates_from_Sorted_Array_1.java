public class Solution {
    public int removeDuplicates(int[] A) {
        if(A.length == 0) return 0;
        int ix = 0;
        for(int jx = 1;jx < A.length; ++jx){
            if(A[jx] != A[ix])
                A[++ix] = A[jx];
        }
        
        return ix + 1;
    }
}