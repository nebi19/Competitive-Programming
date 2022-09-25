class Solution {
    public int fib(int n) {
        int[] memo=new int[n+1];
        return calFib(n,memo);        
    }
    int calFib(int n,int[] memo){
        if(n<2) return n;
     memo[0]=0;
        memo[1]=1;
        for(int i=2;i<memo.length;i++){
            memo[i]=memo[i-1]+memo[i-2];
        }
        return memo[n];
    }
}