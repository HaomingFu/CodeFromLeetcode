public class Solution {
    public void rotate(int[] nums, int k) {
        while(k-- > 0){
            moveOne(nums);
        }
    }
    public void moveOne(int [] nums){
        int tmp = nums[0];
        for(int ix = 1; ix  < nums.length; ++ix){
            nums[ix-1] = nums[ix];
        }
        nums[nums.length - 1] = tmp;
    }
}