class Solution {
    public int calculate(String s) {
         Deque<Integer> stack=new ArrayDeque<>();
        char op=' ';
        for(int i=0;i<s.length();)
        {
            char c=s.charAt(i);
            if(c==' '){
                i++;
                continue;
            }
            else if(Character.isDigit(c))
            {
                int a=c-'0';
                i++;
                while(i<s.length() && Character.isDigit(s.charAt(i)))
                {
                    a=a*10+(s.charAt(i++)-'0');
                }
                if(op=='*' || op=='/')
                {
                    int b=stack.pop();
                    if(op=='/')
                        a=b/a;
                    else
                        a=a*b;
                }
                else if(op=='-'){
                    a*=-1;
                }
                stack.push(a);
            }
            else
            {
                op=s.charAt(i++);
            }
        }
        int sum=0;
        while(!stack.isEmpty())
        {
            sum+=stack.pop();
        }
        return sum;
    }
}