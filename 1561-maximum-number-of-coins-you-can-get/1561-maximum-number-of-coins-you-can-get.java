class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int count=0;
        int sum=0;
        for(int i=piles.length-2;count<piles.length/3;i-=2,count++){
            sum+=piles[i];
        }
        return sum;
        
    }
}