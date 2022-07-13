class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int elem: stones){
            pq.offer(elem);
        }
        
        while(pq.size() > 1){
            int first = pq.poll();
            int second = pq.poll();
            if(first > second){
                pq.offer(first-second);
            }
        }
        if(pq.size() == 0){
            return 0;
        }else{
            return pq.poll();
        }
    }
}