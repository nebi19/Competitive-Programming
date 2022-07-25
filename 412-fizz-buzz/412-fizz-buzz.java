class Solution {
    public List<String> fizzBuzz(int n) {
                 List<String> list = new ArrayList<>();
                
                HashMap<Integer,String> dict = new HashMap<>(){{
                        put(3,"Fizz");
                        put(5,"Buzz");
                }};// mapping to store fizzbuzz mappings
                
                List<Integer> divisors = new ArrayList<>(Arrays.asList(3,5));
            int i=1;
            while(i<=n){
                    String str = "";
                    
                    for(Integer key : divisors){
                       if(i%key == 0){
                               str += dict.get(key);
                       }     
                    }
                    
                    if(str.equals("")) str += Integer.toString(i);
                    
                    list.add(str);
                    
                    i++;
            }
           
        return list;
        
    }
}