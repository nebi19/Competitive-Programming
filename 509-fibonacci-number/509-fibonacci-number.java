class Solution {
    public int fib(int n) {
        int[] memo=new int[n+1];
        return calFib(n,memo);        
    }
    int calFib(int n,int[] memo){
      if(n<2) return n;
        if(memo[n]!=0)return memo[n];
        memo[n]=calFib(n-1,memo)+calFib(n-2,memo);
        return memo[n];
    }
}