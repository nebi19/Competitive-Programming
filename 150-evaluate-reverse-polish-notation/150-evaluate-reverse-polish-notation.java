class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> nums=new Stack();
        for(int i=0;i<tokens.length;i++){
            String op=tokens[i];
            if(op.equals("+")){
                nums.push(nums.pop()+nums.pop());
                
            }else if(op.equals("*")){
                nums.push(nums.pop()*nums.pop());
                
            }else if(op.equals("/")){
                int num=nums.pop();
                nums.push(nums.pop()/num);
                
            }else if(op.equals("-")){
                   int num=nums.pop();
                nums.push(nums.pop()-num);
                
            }else{
                nums.push(Integer.parseInt(op));
            }
        }
        return nums.pop();
        
        
    }
}