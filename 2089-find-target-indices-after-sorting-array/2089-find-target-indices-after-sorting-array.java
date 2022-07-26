class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // List<Integer> rs=new ArrayList<>();
        //  Arrays.sort(nums);
        //  List<Integer> rs=search(nums,0,nums.length-1);
        // return rs;
          List<Integer> list = new ArrayList<>();
        int targetFreq = 0, lessThanTarget = 0;
        
        for(int num : nums){
            if(num == target)
                targetFreq++;
            if(num < target)
                lessThanTarget++;
        }
        
        for(int i = lessThanTarget; i < (lessThanTarget + targetFreq); i++){
            list.add(i);
        }
        return list;
    }
   
}