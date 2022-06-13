class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int j=numbers.length-1;
        int i=0;
        int []rs=new int[2];
        
        while(numbers[i]+numbers[j]!=target){
            if(numbers[i]+numbers[j]>target)j--;
            else i++;
        }
        rs[0]=i+1;
        rs[1]=j+1;
        return rs;
 
    }
}