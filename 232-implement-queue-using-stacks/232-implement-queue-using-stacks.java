class MyQueue {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();
    public MyQueue() {
        
    }
    
    public void push(int x) {
          stack1.push(x);  
        
    }
    
    public int pop() {
         if(stack2.isEmpty()){
            shiftStacks();
        }
        return stack2.pop();
        
    }
    
    public int peek() {
              if(stack2.isEmpty()){
            shiftStacks();
        }
        return stack2.peek();
        
    }
    
    public boolean empty() {
         return stack1.isEmpty()&&stack2.isEmpty();
        
    }
       public void shiftStacks(){
         while(!stack1.isEmpty()){
             int temp=stack1.pop();
             stack2.push(temp);
         }
     }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */