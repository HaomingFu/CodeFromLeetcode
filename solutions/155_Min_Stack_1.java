class MinStack {
    private Stack<Integer> mainStack = new Stack();
    private Stack<Integer> minStack = new Stack();
    public void push(int x) {
        mainStack.push(x);
        if(minStack.empty() || x <= minStack.peek())
            minStack.push(x);
    }

    public void pop() {
        if(mainStack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return mainStack.peek();
        
    }

    public int getMin() {
        return minStack.peek();    
    }
}
