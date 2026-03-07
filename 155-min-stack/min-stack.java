class MinStack {
    public Stack<Integer> stack;
    public Stack<Integer> mins;

    public MinStack() {
        stack=new Stack<>();
        mins=new Stack<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(mins.isEmpty())
        {
            mins.push(val);
        }
        else
        {
            if(mins.peek()>=val)
            {
                mins.push(val);
            }
        }
    }
    
    public void pop() {
        if(stack.isEmpty())
        {
            return;
        }
        int temp=stack.pop();
        if(!mins.isEmpty() && temp==mins.peek() )
        {
            mins.pop();
        }

    }
    
    public int top() {
        if(stack.isEmpty())
        {
            return -1;
        }
        return stack.peek();
    }
    
    public int getMin() {
        if(mins.isEmpty())
        {
            return -1;
        }
        return mins.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */