class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        // for(int i=0;i<=nums.length/2;i+=2){
        //     int temp=nums[i];
        //     nums[i]=nums[nums.length-1-i];
        //     nums[nums.length-1-i]=temp;              
        // }
        //12345
        //i=0 52341
        //i=2 52 
        int i=0;
        int start=0;
        int end=nums.length-1;
        int[] rs=new int[nums.length];
        while(end>start){
            rs[i]=nums[start];
            rs[++i]=nums[end];
            i++;
            start++;
            end--;
            
        }
        if(nums.length%2!=0) rs[i]=nums[end];
        return rs;
        
    }
}