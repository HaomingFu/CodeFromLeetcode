public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total=0, sum = 0;
        int index = 0;
        for(int i=0; i < gas.length; ++i){
            sum += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if(sum < 0){
                index = i;
                sum = 0;
            }
        }
        if(total < 0) return -1;
        return index + 1;
    }
}