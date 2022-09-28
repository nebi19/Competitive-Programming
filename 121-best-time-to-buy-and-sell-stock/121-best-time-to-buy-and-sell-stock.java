class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;
        int startMin=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]-startMin>0){
                maxProfit=Math.max(maxProfit,prices[i]-startMin);
            }
              if(prices[i]<startMin){
                  startMin=prices[i];
              }
            
        }
        if(maxProfit<=0) return 0;
        return maxProfit;
    }
}