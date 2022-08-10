class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int count=0;
        int sum=0;
        int me=piles.length/3;
        for(int i=piles.length-2;count<me;i-=2,count++){
            sum+=piles[i];
        }
        return sum;
        
    }
}