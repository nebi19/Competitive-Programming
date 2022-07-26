class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> rs=new ArrayList<>();
        int lesThanTarget=0;
        int targets=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target)targets++;
            if(nums[i]<target) lesThanTarget++;
        }
        for(int i=lesThanTarget;i<(targets+lesThanTarget);i++) rs.add(i);
        return rs;
    }
 
}