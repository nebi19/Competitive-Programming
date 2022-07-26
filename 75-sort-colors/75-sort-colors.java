class Solution {
    public void sortColors(int[] nums) {
          Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int index = 0;
        for (int i = 0; i < 3; i++) {
            if (map.containsKey(i)) {
                int freq = map.get(i);
                int count = 0;
                while (count < freq && index < nums.length) {
                    nums[index++] = i;
                    count++;
                }
            }
        }
        
    }
}