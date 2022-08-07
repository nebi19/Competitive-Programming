class Solution {
    public int[][] merge(int[][] interval) {
        if(interval.length==1)return interval;
         //sort methode1
        // for(int i=0;i<interval.length;i++){
        //     for(int j=i+1;j<interval.length;j++){
        //         if(interval[i][0]>interval[j][0]){
        //             int[] temp=interval[i];
        //             interval[i]=interval[j];
        //             interval[j]=temp;
        //         }
        //     }
        // }
        
        // for(int i=0;i<interval.length;i++){
        //     for(int j=0;j<interval[0].length;j++){
        //         System.out.print(interval[i][j]+" ");
        //     }
        //     System.out.print(" :");
        // }

//         int[][] rs=new int[interval.length][2];
//         rs[0]=interval[0];
//         int k=0;
//         for(int i=1;i<interval.length;i++){
//             if(rs[k][1]>=interval[i][0]){
//                 rs[k][0]=rs[k][0];
//                 rs[k][1]=Math.max(rs[k][1],interval[i][1]);
//             }else{
//                 rs[++k]=interval[i];
//             }
//         }
        // System.out.println();
        // int[][] result=new int[k+1][2];
        // for(int i=0;i<=k;i++){
        //     result[i]=rs[i];
        //     System.out.print(rs[i][0]+" "+ rs[i][1]+" ");
        // }
        // return result;
        Arrays.sort(interval,(arr1,arr2)->Integer.compare(arr1[0],arr2[0]));
        
        int[][] rs=new int[interval.length][2];
        rs[0]=interval[0];
        int k=0;
        for(int i=1;i<interval.length;i++){
            if(rs[k][1]>=interval[i][0]){
                rs[k][0]=rs[k][0];
                rs[k][1]=Math.max(rs[k][1],interval[i][1]);
            }else{
                rs[++k]=interval[i];
            }
        }
        System.out.println();
        int[][] result=new int[k+1][2];
        for(int i=0;i<=k;i++){
            result[i]=rs[i];
            System.out.print(rs[i][0]+" "+ rs[i][1]+" ");
        }
        return result;
        
    }
}