import java.util.Stack;

class MinStack {
    private Stack<Integer> st;
    private Stack<Integer> min;

    public MinStack() {
        st = new Stack<>();
        min = new Stack<>();
    }
    
    public void push(int val) {
        if (min.isEmpty() || val <= min.peek()) {
            min.push(val);
        }
        st.push(val);
    }
    
    public void pop() {
        if (st.pop().equals(min.peek())) {
            min.pop();
        }
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}
