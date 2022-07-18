class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int sum=0;
        int left=0;
        int right=people.length-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                count++;
                right--;
                left++;   
                if(left==right){count++;break;}
            }
            else{
                count++;
                right--;
            }
        }
        return count;
        
    }
}