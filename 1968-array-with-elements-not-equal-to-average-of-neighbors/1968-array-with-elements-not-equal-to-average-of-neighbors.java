class Solution {
    public int[] rearrangeArray(int[] nums) {
        boolean change=true;
        do{
            change=false;
              for(int i=1;i<nums.length-1;i++){
            float a=nums[i-1]+nums[i+1];
            if(a/2==nums[i]){
                int b=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=b;
                change=true;
            }
        }
        }while(change);
      
        return nums;
    }
}