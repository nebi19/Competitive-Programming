class Solution {
    public int longestSubarray(int[] nums, int limit) {
        
        	PriorityQueue<Integer> minQ = new PriorityQueue<>();
	PriorityQueue<Integer> maxQ = new PriorityQueue<>((a, b) -> b - a);

	int j = 0, i;
	for (i = 0; i < nums.length; i++) {
		minQ.add(nums[i]);
		maxQ.add(nums[i]);

		if (maxQ.peek() - minQ.peek() > limit) {
			minQ.remove(nums[j]);
			maxQ.remove(nums[j]);
			j++;
		}
	}
	return i - j;
        
    }
}