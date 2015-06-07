public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap();
        map.put(\u0027I\u0027, 1);
        map.put(\u0027V\u0027, 5);
        map.put(\u0027X\u0027, 10);
        map.put(\u0027L\u0027, 50);
        map.put(\u0027C\u0027, 100);
        map.put(\u0027D\u0027, 500);
        map.put(\u0027M\u0027, 1000);
        
        int res = 0;
        for(int i = 0; i < s.length() -1; ++i){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i+1)))
                res -= map.get(s.charAt(i));
            else
                res += map.get(s.charAt(i));
        }
        res += map.get(s.charAt(i));
        return res;
    }
}