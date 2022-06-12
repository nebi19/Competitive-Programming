class Solution {
    public void rotate(int[] nums, int k) {
        int [] temp=new int[nums.length];
        int j=0;
        
        if(k==0) return;
        if(k>nums.length){
            k=k%nums.length;
        }
        
        for(int i=0;i<nums.length;i++)
            temp[i]=nums[i];
        
        for(int i=nums.length-k;i<nums.length;i++){
            nums[j]=nums[i];
            j++;
        }
        
          for(int i=0;i<nums.length-k;i++){
            nums[j]=temp[i];
            j++;
        }
        
        
        
    }
}