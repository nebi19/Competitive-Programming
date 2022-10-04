class KthLargest {
     PriorityQueue<Integer> pq;
     int size;

    public KthLargest(int k, int[] nums) {
        this.size=k;
        pq=new PriorityQueue<Integer>();
        for(int i:nums){
            add(i);
        }        
    }
    
    public int add(int val) {
        this.pq.add(val);
        if(pq.size()>this.size){
            pq.remove();
        }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */