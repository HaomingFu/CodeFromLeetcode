public class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int carryOn = 1;
        for(int ix=n-1;ix>=0;--ix){                                                                                                                                                                        
            int tmp = digits[ix];
            digits[ix] = (tmp + carryOn) % 10; 
            carryOn = (tmp + carryOn) / 10; 
        }   
        if(carryOn==1){
            int [] res = new int [n+1];
            System.arraycopy(digits, 0, res, 1, n); 
            res[0] = 1;
            digits = res;
        }   
        return digits;
       
    }
}