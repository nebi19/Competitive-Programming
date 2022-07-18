class Solution {
    public void rotate(int[] nums, int k) {
         k %= nums.length;
        int len = nums.length;
        reverse(nums, 0, len - 1 - k);
        reverse(nums,len - k, nums.length - 1);
        reverse(nums, 0, nums.length - 1);
    }
    
	// Method to reverse array from start index to end index
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }

// Method to swap two numbers
    public void swap(int[] nums, int start, int end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}