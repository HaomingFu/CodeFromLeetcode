public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < num.length - 2; ++i){
            int j = i + 1, k = num.length -1;
            while(j < k){
                if(num[i] + num[j] + num[k] == 0){
                    Integer [] tmp = new Integer []{num[i], num[j], num[k]};
                    res.add(Arrays.asList(tmp));
                    while((k > j) \u0026\u0026 (num[k] == num[k-1])
                        k--;
                    while((j < k) \u0026\u0026 (num[j] == num[j+1])
                        j++;
                }
                else if(num[i] + num[j] + num[k] > 0)
                    k--;
                else
                    j++;
            }
        }
        return res;
    }
}