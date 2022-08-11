class Solution {
    public int evalRPN(String[] tokens) {
          Stack<Integer> stack = new Stack<Integer>();
        int res = 0, x, y;
        
        for(int i = 0; i < tokens.length; ++i) {
             if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/")) {
                 y = stack.pop();
                 x = stack.pop();
                 switch(tokens[i]) {
                     case "+":
                         res = x + y;
                         break;
                    case "-":
                         res = x - y;
                         break;
                    case "*":
                         res = x * y;
                         break;
                    default:
                         res = x / y;
                         break;
                 }
                 stack.push(res);
             }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
            
        }
        return stack.peek();
                           
        
    }
}