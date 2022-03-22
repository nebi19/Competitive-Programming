class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int cnt=0;
        int rank=0;
        for(int num:nums){
            cnt+=(num==target)?1:0;
            rank+=(num<target)?1:0;
        }
       List<Integer> ans = new ArrayList<>();
        while(cnt>0){
            ans.add(rank);
            cnt--;
            rank++;
        }
        
       return ans; 
    }
}