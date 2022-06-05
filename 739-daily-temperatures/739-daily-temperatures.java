class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];
        
        for(int i=0;i<temperatures.length-1;i++){
            boolean flag=false;
              for(int j=i+1;j<temperatures.length;j++){
                  if(temperatures[j]>temperatures[i]){
                      ans[i]=j-i;
                      flag=true;  
                      break;
                  }
           }
            if(!flag){
                ans[i]=0;
            }
            
        }
        return ans;
        
    }
}