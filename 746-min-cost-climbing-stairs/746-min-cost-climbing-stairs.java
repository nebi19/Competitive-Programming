class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp=new int[cost.length];
        return Math.min( minCost(cost,cost.length-1), minCost(cost,cost.length-2));
        
    }
    int minCost(int[] cost, int n){
        if(n<0) return 0;
        if(n<2)
            return cost[n];
        if(dp[n]!=0) return dp[n];
        dp[n]= cost[n]+Math.min(minCost(cost,n-1),minCost(cost,n-2));
        return dp[n];
    }
}