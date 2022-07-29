class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int[] ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]>nums[j]) ans[i]++;
        //     }            
        // }
        // return ans;
        
		int count =0;
        int arr[]=new int[nums.length];
        int j =0;
        for(int i =0;i< nums.length;i++){
            if(j>=nums.length){
                break;
            }
            if(nums[j]>nums[i]){
                count++;
            }
            if(i == nums.length-1){
                i=-1;
                arr[j] =count;
                j++;
                count =0;
            }
        }
       return arr; 
        
    }
}