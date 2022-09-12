class Solution {
    public int longestOnes(int[] A, int K) {
        int l = 0;
        int zeros = 0;
        int res = Integer.MIN_VALUE;
        for(int r = 0;r<A.length;r++){
            if(A[r]==0){
                zeros++;
            }
            
                while(zeros>K){
                    if(A[l]==0)zeros--;
                    l++;
                }
            
            if(zeros<=K){
                res = Math.max(r-l+1,res);
            }
        }
        return res;
        
    }
}