class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
           List<Boolean> list = new ArrayList<>() ;
        
        for(int i=0 ; i<l.length ; i++){
            int[] array = creatingArray(l[i] , r[i] , nums) ;
            if(checkArrayArithmetic(array)==true ){
                list.add(true) ;
            }else{
                list.add(false) ;
            } 
        }
        return list ;
    }
    
    public int[] creatingArray(int i , int j , int[] nums){
         int[] res= new int[j-i+1] ;
         int i1=0 ;
        for(int k=i ; k<=j ; k++){
            res[i1]=nums[k] ;
            i1++ ;
        }
        
        return res ;
    }
    
    public boolean checkArrayArithmetic(int[] array){
        Arrays.sort(array) ;
        int diff=array[1]-array[0] ;      
        for(int i=0 ; i<array.length-1 ; i++){
            if(array[i+1]-array[i]!=diff){
                return false ;
            }
        } 
        
        return true ;
    }
        
    
}