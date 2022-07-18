class Solution {
    public void moveZeroes(int[] nums) {
  int j=0;
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=0) {
                nums[j] = nums[i];
                // Change element at current pointer only if pointers do not collide
                if (i!=j) nums[i] = 0;
                j++;
            } 
        }
        
    }
}