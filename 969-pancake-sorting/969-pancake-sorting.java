class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans=new ArrayList();
        for(int i=arr.length-1;i>0;--i){
            for(int j=1;j<=i;++j){
                if(arr[j]==i+1){
                    flip(arr,j);
                    ans.add(j+1);
                    break;
                }
            }
              flip(arr,i);
                    ans.add(i+1);
        }
     return ans;   
        
    }
    void flip(int[] a ,int index){
        for(int i=0;i<=index/2;++i){
            int temp=a[i];
            a[i]=a[index-i];
            a[index-i]=temp;
        }
    }
}