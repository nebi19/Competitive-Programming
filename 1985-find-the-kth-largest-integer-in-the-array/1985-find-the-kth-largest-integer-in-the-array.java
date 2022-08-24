class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, this::compare);
        return nums[nums.length-k];
        
    }
    public int compare(String n1,String n2){
        if(n1.equals(n2)) return 0;
        int len1=n1.length();
        int len2=n2.length();
        if(len1!=len2) return len1-len2;
          for(int i = 0; i < len1; i++) {
            char d1 = n1.charAt(i);
            char d2 = n2.charAt(i);
            if(d1 != d2) return d1 - d2;            
        }
        return 0;
    }
}