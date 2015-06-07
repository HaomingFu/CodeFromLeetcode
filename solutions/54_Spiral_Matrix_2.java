public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList();
        int m = matrix.length;
        if(m==0) return result;
        int n = matrix[0].length;
                
        int right = n-1, bottom = m-1, left = 0, top = 1;
        int i=0, j=0;
        int count = 0;
        while(count < m*n){
            while (i <=right){
                result.add(matrix[i++][j]);
                count++;
            }   
            i=right;
            right--;
            j++;
            while(j <= bottom){
                result.add(matrix[i][j++]);
                count++;
            }   
            j = bottom;
            bottom--;
            i--;
            while(i>=left){
                result.add(matrix[i--][j]);
                count++;
            }   
            i = left;
            left++;
            j--;
            while(j>=top){                                                                                                            
                result.add(matrix[i][j--]);
                count++;
            }   
            j = top;
            top++;
            i++;
        }       
        return result;
                
        
    }
}