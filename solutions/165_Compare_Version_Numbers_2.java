public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] nums1 = version1.split("\u005C\u005C.");
        String[] nums2 = version2.split("\u005C\u005C.");
        
        int size1 = nums1.length;
        while(size1 > 0 \u0026\u0026 Integer.parseInt(nums1[size1-1])==0)
            size1--;
        int size2 = nums2.length;
        while(size2 > 0 \u0026\u0026 Integer.parseInt(nums2[size1-1])==0)
            size2--;
        int n = Math.min(size1, size2);
        for(int i=0;i<n;++i){
            int val1 = Integer.parseInt(nums1[i]);
            int val2 = Integer.parseInt(nums2[i]);
            if (val1 < val2)
                return -1;
            else if(val1 > val2)
                return 1;
        }
        if (n == size1 \u0026\u0026 n == size2)
            return 0;
        if(n == size1)
            return -1;
        else
            return 1;
    }
}