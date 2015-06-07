public class Solution {
    private static final Map<Character, Character> map = new HashMap(){{
        put(\u0027(\u0027, \u0027)\u0027);
        put(\u0027[\u0027, \u0027]\u0027);
        put(\u0027{\u0027, \u0027}\u0027);
    }};
    public boolean isValid(String s) {
       Stack<Character> stack = new Stack(); 
       for(char c : s.toArray()){
           if(map.containsKey(c)){
               stack.push(c);
           }else if (stack.isEmpty() || map.get(stack.pop()) != c){
               return false;
           }
       }
       return stack.empty();
    }
}