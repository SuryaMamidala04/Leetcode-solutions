class MyCircularDeque {
    int[] queue;
    int cap;
    int size;
    int front;
    int rear;
    public MyCircularDeque(int k) {
        this.cap = k;
        this.queue = new int[k];
        this.size = 0;
        this.front = 0;
        this.rear = 0;
    }
    
    public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        else if(front==0){
            front = cap-1;
            queue[front] = value;
            size++;
            return true;
        }
        front = (front-1)%cap;
        queue[front] = value;
        size++;
        return true;
    }
    
    public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        queue[rear] = value;
        rear = (rear+1)%cap;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        front = (front+1)%cap;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        else if(rear==0){
            size--;
            rear = cap-1;
        }
     else{
        rear = (rear-1)%cap;
        size--;
      }
        return true;
    }
    
    public int getFront() {
        if(isEmpty()) return -1;
        return queue[front];
    }
    
    public int getRear() {
        if(isEmpty()) return -1;
        else if(rear==0) return queue[cap-1];
        return queue[rear-1];
    }
    
    public boolean isEmpty() {
        if(size==0) return true;
        else return false;
    }
    
    public boolean isFull() {
        if(size == cap) return true;
        else return false;
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