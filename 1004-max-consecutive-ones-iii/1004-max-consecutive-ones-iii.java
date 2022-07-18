class Solution {
    public int longestOnes(int[] nums, int k) {
      int start = 0;
    int end = 0;
    int flip = 0;    
    while (end < nums.length) {
        if (nums[end] == 0)
            flip++;
        
        end++;
        if (flip > k) {
            if (nums[start] == 0)
                flip--;
            start++;
        }
    }
    return end - start;
        
    }
}