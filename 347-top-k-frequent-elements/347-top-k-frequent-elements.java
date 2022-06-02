class Solution {
    public int[] topKFrequent(int[] nums, int k) {
             if (k == nums.length) {
            return nums;
        }
        // find the frequency of each number
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();

        for (int n: nums) {
            numFrequencyMap.put(n, numFrequencyMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() -
                e2.getValue());

        // go through all numbers of map & push them in a minHeap which will have top k elements
        // If at any time it has > K elements, then remove the smallest element.

        for(Map.Entry<Integer, Integer> entry : numFrequencyMap.entrySet()) {
            minHeap.add(entry);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Let's create a list of top k elements
        int[] topNumbers = new int[k];
        int i=0;
        while (!minHeap.isEmpty()) {
            topNumbers[i]=minHeap.poll().getKey();
            i++;
        }
        return topNumbers;
        
    }
}