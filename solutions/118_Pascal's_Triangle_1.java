public class Solution {
    public ArrayList<ArrayList<Integer>> generate(int numRows) {
       ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
       for(int i = 0; i < numRows; i++){                                                                                              
           ArrayList<Integer> temp = new ArrayList<Integer>();
           temp.add(1);
           if( i > 0){ 
               for(int j = 0; j < res.get(i-1).size()-1; j++)
                   temp.add(res.get(i-1).get(j) + res.get(i-1).get(j+1));
               temp.add(1);
           }         
           res.add(temp);
       }  
       return res;
    }
}