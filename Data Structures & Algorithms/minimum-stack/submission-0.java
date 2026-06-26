class MinStack {
    Stack<Integer> st;
    Stack<Integer> minStack;
    public MinStack() {
        this.st = new Stack<Integer>();
        this.minStack = new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
        if(minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if(st.isEmpty()) return ;
        int top = st.pop();
        if(top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
