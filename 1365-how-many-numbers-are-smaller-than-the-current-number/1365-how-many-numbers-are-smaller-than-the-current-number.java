class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        // int[] ans=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]>nums[j]) ans[i]++;
        //     }            
        // }
        // return ans;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int [] copy = nums.clone();
        Arrays.sort(copy);
        
        for(int i = 0; i < copy.length; i++){
            map.putIfAbsent(copy[i], i);
        }
        
        for(int i = 0; i < nums.length; i++){
            copy[i] = map.get(nums[i]);
        }
        return copy;
        
    }
}