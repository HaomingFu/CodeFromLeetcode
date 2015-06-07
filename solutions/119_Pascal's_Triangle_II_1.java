public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList();
        if (rowIndex == 0){ 
            res.add(1);
            return res;
        }   
        if (rowIndex == 1){ 
            res.add(1);res.add(1);
            return res;
        }   
        Integer [] last = new Integer [rowIndex+1];
        last[0] = last[1]=1;
        Integer [] cur = new Integer [rowIndex+1];
            
        int count = 2;
        while(count <= rowIndex){
            cur[0] = 1;cur[count]=1;
            for(int ix = 1; ix < count; ++ix)
                cur[ix]=  last[ix-1] + last[ix];
            Integer []tmp = last;
            last = cur;
            cur = tmp;
            count++;
        }   
        return Arrays.asList(last);                                                                                                   
         

    }
}