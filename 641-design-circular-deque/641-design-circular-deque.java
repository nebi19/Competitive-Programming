class MyCircularDeque {
    int size;
    int[] deQueue;
    int front;
    int rear;

    public MyCircularDeque(int k) {
        size=k;
        deQueue=new int[k];
        front=-1;
        rear=-1;
        
    }
    
    public boolean insertFront(int value) {
        if(isFull()) return false;
        if(isEmpty()){front=0;
                      rear=0;
                     }
        else if(front==0){front=size-1;}
        else{front-=1;}
          deQueue[front]=value;
    
        return true;
        
    }
    
    public boolean insertLast(int value) {
       if(isFull()) return false;
        if(isEmpty()){
            front=0;
            rear=0;
        }
        else if(rear==size-1){rear=0;}
        else{rear+=1;}
         deQueue[rear]=value;
        return true;
    }
    
    public boolean deleteFront() {
        if(front==-1) return false;
        if(front==rear){
            front=-1;
            rear=-1;
        }else{
            front=(front+1)%size;
        }
        return true;
        
    }
    
    public boolean deleteLast() {
        if(rear==-1) return false;
        if(rear==0&&front!=0){
            rear=size-1;
        }else if(rear==front){
            rear=-1;
            front=-1;
        }else{
            rear-=1;
        }
        return true;
        
        
    }
    
    public int getFront() {
        if(front==-1) return -1;
        return deQueue[front];
        
    }
    
    public int getRear() {
        if(rear==-1) return -1;
        return deQueue[rear];
        
    }
    
    public boolean isEmpty() {
        if(front==-1||rear==-1) return true;
        return false;
    }
    
    public boolean isFull() {
        if(((rear+1)%size)==front) return true;
        return false;
        
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */