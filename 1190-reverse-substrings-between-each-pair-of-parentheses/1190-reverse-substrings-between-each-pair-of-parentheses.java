class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack();
        Queue<Character> q= new LinkedList<>();
        for(char c:s.toCharArray()){
            if(c==')'){
               while(!(st.peek()=='('||st.empty())){
                    q.add(st.pop());
               }
                st.pop();
                while(!q.isEmpty()){
                   st.push(q.poll()); 
                }
                
            }else{
                st.push(c);
            }
         }
     	char[] ans = new char[st.size()];
    	for(int i = ans.length - 1; i >= 0; i--)
    		ans[i] = st.pop();
    	return new String(ans);
    }
}