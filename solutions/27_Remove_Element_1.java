public class Solution {
    public int removeElement(int[] A, int elem) {
        int ix = 0;
        for(int jx = 0; jx < A.length; ++jx){
            if(A[jx] == elem)
                continue;
            else{
                A[ix++] = A[jx];
            }
        }
        return ix;
    }
}