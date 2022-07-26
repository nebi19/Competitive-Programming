class Solution {
    public String sortSentence(String s) {
        s=s.trim();
        String[] answer=new String[s.split(" ").length];
        String[] word=s.split(" ");
        for(String sa:word){
            int position=sa.charAt(sa.length()-1)-'0';
            answer[position-1]=sa.substring(0,sa.length()-1);
        }
        
        return String.join(" ",answer);
        
    }
}