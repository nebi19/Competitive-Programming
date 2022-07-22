class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1) return true;
        if(n%4!=0) return false;
        if(n==0) return false;
        return isPowerOfFour(n/4);
//   if(n==0) return false;
//    int pow = (int) (Math.log(n) / Math.log(4));
//    if(n==Math.pow(4, pow)){
//        return true;
//    }else{
//        return false;
//    }
        
    }
}