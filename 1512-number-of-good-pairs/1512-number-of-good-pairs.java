class Solution {
    public int numIdenticalPairs(int[] nums) {
        int start=0;
        int end=nums.length-1;
       for(int i=0;i<nums.length;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]==nums[j]) start++;
           }
       }
        return start;
        
        
    }
}