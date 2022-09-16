class Solution {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int end=0;
        while(end<nums.length){
            sum+=nums[end++];
            max=Math.max(max,sum);
            if(sum<=0){
                sum=0;
            }
        }  
        return max;
        
    }
}