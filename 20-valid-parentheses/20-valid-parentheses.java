class Solution {
    public boolean isValid(String s) {
              Stack<Character> s1=new Stack<>();
    boolean isValid=false;
    if(s.length()==0)return false;
    for(Character i: s.toCharArray()){
        System.out.println("for in isValicParanthesis : " +i);
        if(i==']'||i==')'||i=='}'){
            if(s1.isEmpty()) return false;
        System.out.println("type in isValicParanthesis : " +i);
            if(s1.peek()=='['&&i==']'||s1.peek()=='('&&i==')'||s1.peek()=='{'&&i=='}'){
        System.out.println("pop in isValicParanthesis : " +i);

                s1.pop();
            }else{
        System.out.println("push typein isValicParanthesis : " +i);

                s1.push(i);
            }
        }else{
        System.out.println("push in isValicParanthesis : " +i);

            s1.push(i);
        }
    }
    if(s1.isEmpty()){
        System.out.println("Empty in isValicParanthesis : ");

     return true;
    }

return isValid;
}
}