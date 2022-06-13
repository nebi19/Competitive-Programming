class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int []rs=new int[2];
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                rs[0]=i;
                rs[1]=map.get(nums[i]);
                
            }else{
                map.put(target-nums[i],i);
            }
        }
        
        return rs;
        
    }
}