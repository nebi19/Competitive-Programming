class Solution {
    public boolean isPowerOfThree(int n) {
         if(n==1) return true;
        if(n%3!=0) return false;
       
        if(n==0) return false;
        
        return isPowerOfThree(n/3);
        // return Math.log10(n)/Math.log10(3)%1==0;
        
    }
}