class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
      List<Boolean> ans=new ArrayList();
        for(int i=0;i<l.length;i++){
             Boolean item=isArthemetic(Arrays.copyOfRange(nums, l[i], r[i]+1));  
             ans.add(item);
        }
        return ans;
    }
    Boolean isArthemetic(int[] nums){
         Arrays.sort(nums);
            int len = nums.length;
            int d = nums[1] - nums[0];
            for (int i = 2; i <= len - 1; i++) {
                if (nums[i] - nums[i - 1] != d) {
                    return false;
                }
            }
            return true;
        
    }
}