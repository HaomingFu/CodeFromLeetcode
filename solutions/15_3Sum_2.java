public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
                    
        int i =0; 
        while(i< num.length -2){
            int j = i + 1, k = num.length -1; 
            while(j < k){ 
                if(num[i] + num[j] + num[k] == 0){ 
                    Integer [] tmp = new Integer []{num[i], num[j], num[k]};
                    res.add(Arrays.asList(tmp));
                    k--;j++;
                    while( (num[k] == num[k+1]))
                        k--;
                    while((num[j] == num[j-1]))
                        j++;
                }   
                else if(num[i] + num[j] + num[k] > 0)
                    k--;
                else
                    j++;
            }       
            i++; 
            while(i < num.length-2 \u0026\u0026 num[i]==num[i-1])
                i++;                                                                                                                    
        }           
        return res;

    }
}