public class Solution {
    public boolean isValidSudoku(char[][] board) {
        if(board.length != 9) return false;
        
        for(int ix = 0; ix < 9; ++ix){
            HashSet<Integer> nums = new HashSet<Integer>();
            for(int jx = 0; jx < 9; ++jx){
                if(board[ix][jx] == \u0027.\u0027) continue;
                Integer v = new Integer(Character.getNumbericValue(board[ix][jx]));
                if(nums.contains(v)) return false;
                nums.add(v);
            }
        }
         for(int jx = 0; jx < 9; ++jx){
            HashSet<Integer> nums = new HashSet<Integer>();
            for(int ix = 0; ix < 9; ++ix){
                if(board[ix][jx] == \u0027.\u0027) continue;
                Integer v = new Integer(Character.getNumbericValue(board[ix][jx]));
                if(nums.contains(v)) return false;
                nums.add(v);
            }
        }
        for(int ix=0; ix < 3; ++ix){
            for(int jx=0;jx < 3; ++jx){
                if(not isValid(board, ix*3, jx*3)
                    return false;
            }
        }
        return true;
    }
    
    private boolean isValid(char [][] board, int ix, int jx){
        HashSet<Integer> nums = new HashSet<Integer>();
        for(int i = ix; i < ix + 3; ++i)
            for(int j = jx; j < jx + 3; ++j){
                if(board[i][j] == \u0027.\u0027) continue;
                Integer v = new Integer(Character.getNumbericValue(board[ix][jx]));
                if(nums.contains(v)) return false;
                nums.add(v);
            }
        return true;
    }
}