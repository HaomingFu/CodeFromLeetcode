public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if (board==null|| board.length!=9 || board[0].length!=9){
            return false;
        }
        
       // initialize the Checkers
       ArrayList<boolean[]> rowChecker=new ArrayList<boolean[]>();
       ArrayList<boolean[]> colChecker=new ArrayList<boolean[]>();
       ArrayList<boolean[]> blockChecker=new ArrayList<boolean[]>();
       
       for (int i=0; i<9; i++){
           rowChecker.add(new boolean[9]);
           colChecker.add(new boolean[9]);
           blockChecker.add(new boolean[9]);
       }
       
       for (int i=0; i<9; i++){
           for (int j=0; j<9; j++){
               if (board[i][j]==\u0027.\u0027){
                   continue;
               }
              int c= board[i][j]-\u00271\u0027 ;
              if (rowChecker.get(j)[c]==true || colChecker.get(i)[c]==true || blockChecker.get(i/3*3+j/3)[c]==true){
                  return false;
              }
              else{
                  
                  rowChecker.get(j)[c]=true;
                  colChecker.get(i)[c]=true;
                  blockChecker.get(i/3*3+j/3)[c]=true;
              }
               
           }
       }
       
       return true;
        
    }
}