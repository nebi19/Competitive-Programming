class Solution {
    public int rob(int[] nums) {
        if (nums.length==1)return nums[0];
        return Math.max(helper(0,nums.length-1,nums),helper(1,nums.length,nums));
        
    }
    int helper(int start,int end,int[] nums){
        int rob1=0,rob2=0;
        for(int i=start;i<end;i++){
            int temp=rob2+nums[i];
            rob2= Math.max( rob2,rob1);
            rob1=temp;
        }
        return  Math.max(rob1,rob2);
    }
}