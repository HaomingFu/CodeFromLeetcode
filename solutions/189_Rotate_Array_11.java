public class Solution {
    public void rotate(int[] nums, int k) {
        int [] tmp = new int[k];
        for(int i = 0; i< k; ++i)
            tmp[i] = nums[i];
        for(i = k; i< nums.length; ++i){
            nums[i-k] = nums[i];
        }
        for(i = 0; i<k; ++i)
            nums[nums.length - i-1] = tmp[tmp.length - i - 1];
    }
}