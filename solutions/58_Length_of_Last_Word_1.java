public class Solution {
    public int lengthOfLastWord(String s) {
        String [] slist = s.trim().split("\u005C\u005Cs+");
        
        if(slist.length == 0)
            return 0;
        return slist[slist.length-1].length();
    }
}