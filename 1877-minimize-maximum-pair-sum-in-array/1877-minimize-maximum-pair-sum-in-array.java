class Solution {
    public int minPairSum(int[] nums) {
        if(nums.length==2) return nums[0]+nums[1];
        Arrays.sort(nums);
        int start=1;
        int end=nums.length-2;
        int result=nums[0]+nums[nums.length-1];
        
       while(start<end){
           result=Math.max(result,nums[start]+nums[end]);
           start++;
           end--;
       }
        return result;
        
    }
}