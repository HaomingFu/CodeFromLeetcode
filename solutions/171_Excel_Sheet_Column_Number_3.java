public class Solution {
    public int titleToNumber(String s) {
      int res = 0;
      for(int i = 0; i < s.length(); ++i){
          int tmp = s.charAt(i) - \u0027a\u0027 + 1;
          res *= 26 + tmp;
      }
      return res;
    }
}