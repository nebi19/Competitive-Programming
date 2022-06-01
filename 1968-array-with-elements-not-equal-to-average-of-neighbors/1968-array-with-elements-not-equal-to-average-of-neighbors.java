class Solution {
    public int[] rearrangeArray(int[] nums) {
Arrays.sort(nums);// Sort small to large
int n =nums.length,m=n-1,t=0;
int[] res = new int[n];// New space
for (int i = 0; i <n ; i++) {
if (i%2==1){
res[i]=nums[m];// Store in odd numbers
m--;// Start with the biggest
}else{
res[i]=nums[t];// Store in even numbers
t++;
}
}
return res;
    }
}