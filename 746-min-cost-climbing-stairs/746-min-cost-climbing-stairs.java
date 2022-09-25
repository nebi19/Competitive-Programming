class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        int frist=cost[0];
        int second=cost[1];
        for(int i=2;i<cost.length;i++){
            int curr=cost[i]+Math.min(frist,second);
            frist=second;
            second=curr;
        }
        return Math.min(frist,second);
        
    }
 
}