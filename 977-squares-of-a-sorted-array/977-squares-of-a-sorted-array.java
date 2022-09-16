class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int start=0;
        int end=nums.length-1;
        while(end>=start){
            ans[start]=nums[start]*nums[start];
            ans[end]=nums[end]*nums[end];
            start++;
            end--;
        }
        Arrays.sort(ans);
        return ans;
        
    }
}