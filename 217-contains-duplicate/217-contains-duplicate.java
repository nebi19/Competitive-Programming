class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> fre=new HashMap<Integer,Integer>();
        boolean flag=false;
        for(int i:nums){
            if(fre.containsKey(i)) return true;
          int  occ=fre.getOrDefault(i,0)+1;
          //   if(occ>=2){
          //       flag=true;
          //   }
            fre.put(i,occ);
        }
        return flag;
        
    }
}