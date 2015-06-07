public class Solution {
    private static final int [] values = {
        1000, 900, 500, 400, 
        100, 90, 50, 40, 
        10, 9, 5, 4, 
        1
    };
    private static final string [] symbols = {
        "M", "CM", "D", "CD", 
        "C", "XC", "L", "XL", 
        "X", "IX", "V", "IV", 
        "I"
    };
    public String intToRoman(int num) {
        int i = 0;
        StringBuilder roman = new StringBuilder();
        while(num > 0){
           int k = num / values[i];
           for(int j = 0; j < k; j++){
               roman.append(symbols[i]);
               num -= values[i];
           }
           i++;
        }
        return roman.toString();
    }
}