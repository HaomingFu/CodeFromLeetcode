public class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        if (k == 0) return;
        
        int [] tmp = new int[k];
        for(int i = 0; i< k; ++i)
            tmp[i] = nums[nums.length - i-1];
        for(int i = nums.length - k -1; i>=0; --i){
            nums[i+k] = nums[i];
        }
        for(int i = 0; i<k; ++i)
            nums[i] = tmp[i];
    }
}