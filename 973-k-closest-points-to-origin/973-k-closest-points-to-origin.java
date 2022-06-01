class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[] dist= new int[points.length];
        
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            dist[i]=(x*x) + (y*y);  
            
        }
        
        Arrays.sort(dist);

        int distk=dist[k-1];
        
        int[][] ans=new int[k][2];
        int j=0;
        for(int i=0;i<points.length;i++){
            int x=points[i][0];
            int y=points[i][1];
            dist[i]=(x*x) + (y*y);  
            if(dist[i]<=distk){
                 ans[j][0]=x;
                ans[j][1]=y;
                j++;
               
            }
        }
        return ans;       
        
    }
}