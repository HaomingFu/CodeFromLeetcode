public class Solution {
    public int [] twoSum(int [] numbers, int target){
        int [] res = new int [2];                                                                                                                                                         
        Map<Integer, Integer> map = new HashMap();
 
        for(int ix=0; ix < numbers.length; ix++){
            int x = numbers[ix];
            if(map.containsKey(target - x)) 
                return new int[] {map.get(target-x) + 1, ix + 1}; 
            map.put(x, ix);
        }   
        throw new IllegalArgumentException("No two sum solution");
    }   

}