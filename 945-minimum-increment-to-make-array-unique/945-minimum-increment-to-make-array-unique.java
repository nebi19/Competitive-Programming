class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int moves=0;
        
        for(int i=0;i<nums.length-1;i++){
            int diff=0;
            if(nums[i+1]<=nums[i]){
                diff=nums[i]+1-nums[i+1];
                moves+=diff;
                nums[i+1]+=diff;
                
            }
        }
        return moves;
        
    }
}