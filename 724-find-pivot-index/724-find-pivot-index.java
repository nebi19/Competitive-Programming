class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        int leftSum=0;
        
        for(int j=0;j<nums.length;j++)
            totalSum+=nums[j];
        
        for(int i=0;i<nums.length;i++){
            totalSum=totalSum-nums[i];
            if(totalSum==leftSum){
                return i;
            }
            leftSum+=nums[i];
            
        }
        return -1;
        
        
    }
}