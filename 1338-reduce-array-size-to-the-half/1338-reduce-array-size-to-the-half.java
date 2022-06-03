class Solution {
    public int minSetSize(int[] arr) {
        int counter=0;
        int sum=0;
        int k=arr.length/2;
        Map<Integer,Integer> occ=new HashMap();
        for(int i=0;i<arr.length;i++){
           occ.put(arr[i], occ.getOrDefault(arr[i], 0) + 1);
        }            
        int[] freq=new int[occ.size()];
        int j=0;
        for(int i:occ.values()){
            freq[j]=i;
            j++;
        }
        Arrays.sort(freq);
        for(int i=freq.length-1;i>=0;i--){
            if(sum>=k){break;}
            else{
                counter++;
                sum+=freq[i];
                }
        }
        return counter;
        
    }
}