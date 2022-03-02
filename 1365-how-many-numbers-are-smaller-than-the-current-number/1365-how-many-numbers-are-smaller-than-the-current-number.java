class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
         int[] smaller=new int[101];
        for(int i=0;i<nums.length;i++){
            ++smaller[nums[i]];
        }
         for(int i=1;i<smaller.length;i++){
           smaller[i]+=smaller[i-1];
        }
         for(int i=0;i<nums.length;i++){
             int pos=nums[i];
             if(pos==0) nums[i]=0;
             else{
                 nums[i]=smaller[pos-1];
             }
    
        }
return nums;
        
    }
}