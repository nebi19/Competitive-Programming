class Solution {
    public int maxSubArray(int[] nums) {
        // int maxSum=Integer.MIN_VALUE;
        int maxSum=nums[0];
        int sum=0;
        int[] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            // sum+=nums[i];
            // maxSum=Math.max(maxSum,sum);
            // if(sum<0) sum=0;
            dp[i]=nums[i]+(dp[i-1]>0?dp[i-1]:0);
            maxSum=Math.max(maxSum,dp[i]);
        }
        return maxSum;
        
        
    }
}