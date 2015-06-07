public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\u005C\u005C.");
        String[] nums2 = version2.split("\u005C\u005C.");
        
        int n = Math.min(nums1.length, nums2.length);
        for(int i=0;i<n;++i){
            int val1 = Integer.parseInt(nums1[i]);
            int val2 = Integer.parseInt(nums2[i]);
            if (val1 < val2)
                return -1;
            else if(val1 > val2)
                return 1;
        }
        if (n == nums1.length \u0026\u0026 n == nums2.length)
            return 0;
        if(n == nums1.length)
            for(;n<nums2.length;++n){
                if(Integer.parseInt(nums2[n])!=0)
                    return -1;
            }
        else
            for(; n < nums1.length; ++n){
                if(Integer.parseInt(nums1[n])!=0)
                    return 1;
            }
            
        return 0;
    }
}