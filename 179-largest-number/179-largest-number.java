class Solution {
    public String largestNumber(int[] nums) {
        String[] res=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=String.valueOf(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String a=res[i]+res[j];
                String b=res[j]+res[i];
                if(b.compareTo(a)>0){
                    String temp=res[i];
                    res[i]=res[j];
                    res[j]=temp;
                    //compareTo
                }
            }
            
        }
        String result="";
        if(res[0].compareTo("0")==0) return "0";
        for(int i=0;i<nums.length;i++){
            result+=res[i];
        }
        return result;
        
    }
}