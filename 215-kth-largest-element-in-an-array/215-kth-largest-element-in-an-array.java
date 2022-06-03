class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Arrays.sort(nums);
        // return nums[nums.length-k];
        PriorityQueue<Integer> numq= new PriorityQueue<Integer>();
        for(int num: nums){
            numq.add(num);
            if(numq.size()>k){
                numq.remove();
            }
        }
        return numq.peek();
        
    }
}