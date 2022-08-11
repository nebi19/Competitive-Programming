class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int j=0;j<tokens.length;j++){
            String i=tokens[j];
            if(i.equals("+")||i.equals("-")||i.equals("*")||i.equals("/")){
                
                if(i.equals("+"))st.push(st.pop()+st.pop());
                
                if(i.equals("*"))st.push(st.pop()*st.pop());
                
                if(i.equals("-")){
                    int a=st.pop();
                    st.push(st.pop()-a);
                            }
                if(i.equals("/")){
                    int a=st.pop();
                    st.push(st.pop()/a);
                }



            }else{
                st.push(Integer.parseInt(i));
            }
        }
        return st.peek();
                           
        
    }
}