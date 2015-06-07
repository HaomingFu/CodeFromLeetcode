public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0)
            return "";
        int ix = 0;
        StringBuilder sb = new StringBuilder();
        char cur;
        while(true){
            if(ix < strs[0].length())
                cur = strs[0].charAt(ix);
            else
                return sb.toString();
            for(int k = 1; k < strs.length;++k){
                if(ix >= strs[k].length() || strs[k].charAt(ix) != cur)
                    return sb.toString();
            }
            sb.append(cur);
            ix++;
        }
        return sb.toString();
    }
}