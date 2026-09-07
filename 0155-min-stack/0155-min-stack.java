class MinStack {

    ArrayDeque<Integer> st;
    ArrayDeque<Integer> mst;


    public MinStack() {
        this.st = new ArrayDeque<>();
        this.mst = new ArrayDeque<>();
    }
    
    public void push(int value) {
        st.push(value);

        if(mst.isEmpty()){
            mst.push(value);
        }else{
            mst.push(Math.min(value,mst.peek()));
        }
    }
    
    public void pop() {
        st.pop();
        mst.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */