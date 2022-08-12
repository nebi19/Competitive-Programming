class MinStack {
    Stack<Integer> st;
    Stack<Integer> st1;

    public MinStack() {
        st=new Stack<>();
        st1=new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if(st1.isEmpty()||val<=st1.peek()) {
            st1.push(val);
            System.out.println("stack1 pushed"+val);
        }
        
    }
    
    public void pop() {
        int x=st.peek();
        int y=st1.peek();
            if( x==y){
                System.out.println("stack1 pop"+st1.peek());
                st1.pop();
            }
           st.pop(); 
     
            
        
    }
    
    public int top() {
          if(!st.empty())
            return st.peek();
        return -1;
        
    }
    
    public int getMin() {
                        System.out.println("stack1 min"+st1.peek());

        return st1.peek();
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