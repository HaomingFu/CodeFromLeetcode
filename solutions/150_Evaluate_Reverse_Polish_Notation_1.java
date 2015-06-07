public class Solution {
    private static final Set<String> OPERATORS = new HashSet(Arrays.asList("+", "-", "*", "/"));
    
    public int evalRPN(String[] tokens) {
        Stack<Integer> numStack = new Stack();
                    
        for(String op : tokens){
            if (OPERATORS.contains(op)){
                int op2 = numStack.pop();
                int op1 = numStack.pop();
                switch (op) {                                                                                        
                    case "*":
                        numStack.push(op1*op2);
                        break;
                    case "/":
                        numStack.push(op1 / op2);
                        break;
                    case "+":
                        numStack.push(op1 + op2);
                        break;
                    default:
                        numStack.push(op1 - op2);
                        break;
                }   
            } else
                numStack.push(Integer.parseInt(op));
        }           
                    
        return numStack.peek();        
    }
}