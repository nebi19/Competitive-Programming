class Solution {
    public int maxProfit(int[] prices) {
         int maxProfit=0;
        int startMin=prices[0];
        for(int i=1;i<prices.length;i++){
            if(prices[i]-prices[i-1]>0){
                maxProfit+=prices[i]-prices[i-1];
            }
           
        }
        return maxProfit;
        
    }
}