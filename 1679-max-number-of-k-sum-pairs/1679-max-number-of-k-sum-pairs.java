class Solution {
    public int maxOperations(int[] nums, int k) {
        int start=0;
        int end=nums.length-1;
        int result=0;
        Arrays.sort(nums);
       
    while(start<end){
            if(nums[start]+nums[end]>k){
            end--;
            
        }
          else if(nums[start]+nums[end]<k){
              start++;
              
            
        }
        else{
            start++;
            end--;
            result++;
            
        }
    }
        return result;
        
    }
}