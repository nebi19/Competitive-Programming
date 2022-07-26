class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> rs=new ArrayList<>();
         Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target) rs.add(i);
        }
        return rs;
       
        
    }
}