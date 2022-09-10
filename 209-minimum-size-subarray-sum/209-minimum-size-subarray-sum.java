class Solution {
    public int minSubArrayLen(int target, int[] nums){ 
        int min=Integer.MAX_VALUE;
        int sum=0;
        int start=0;
        int last=0;
    while(last<nums.length){
        sum+=nums[last++];
        while(sum>=target){
            min=Math.min(min,last-start);
            sum-=nums[start++];
            if(sum==0) return 1;
        }
    }
    return min==Integer.MAX_VALUE?0:min;
        
    }
}