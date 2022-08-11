class Solution {
    public boolean isValid(String s) {
        char[] charcter=new char[s.length()];
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
           if(s.charAt(i)==')'||s.charAt(i)=='}'||s.charAt(i)==']'){
               if(st.empty()) return false;
               //pop
               if(s.charAt(i)==')'){if(st.pop()=='(') continue; else return false;}
               if(s.charAt(i)=='}'){if(st.pop()=='{') continue; else return false;}
               if(s.charAt(i)==']'){if(st.pop()=='[') continue; else return false;}
           }else{
               //push
               st.push(s.charAt(i));
           }
        }
    if(st.empty()) return true;
        return false;
        
    }
}