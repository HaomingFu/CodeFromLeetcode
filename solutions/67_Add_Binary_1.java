public class Solution {
    public String addBinary(String a, String b) {
        a = new StringBuilder(a).reverse().toString();
        b = new StringBuilder(b).reverse().toString();
        
        int lenA = a.length();
        int lenB = b.length();
        
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        int numa=0, numb=0;
        for(int ix=0; ix < Math.max(lenA, lenB); ++ix){
            if( ix < lenA)
                numa = (a.charAt(ix) == \u00270\u0027)? 0:1;
            else
                numa = 0;
            if( ix < lenB)
                numb = (b.charAt(ix) == \u00270\u0027) ? 0:1;
            else
                numb = 0;
            sb.append((numa + numb + carry)%2);
            carry = (numa + numb + carry) / 2;
        }
        if(carry == 1)
            sb.append(carry);
        
        return sb.reverse().toString();
    }
}