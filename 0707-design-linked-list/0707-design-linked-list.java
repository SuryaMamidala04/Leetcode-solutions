class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class MyLinkedList {
        Node head ;
        Node tail;
        int count;
    public MyLinkedList() {
        this.head = null;
        this.tail  =null;
        this.count = 0;
    }
    
    public int get(int index) {
        if(index>=count){
            return -1;
        }
        Node curNode = head;
        for(int i=0; i<index; i++){
            curNode = curNode.next;
        }
        return curNode.data;
    }
    
    public void addAtHead(int val) {
        count++;
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }
    
    public void addAtTail(int val) {
        count++;
        Node newNode = new Node(val);
        if(tail == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        return;
    }
    
    public void addAtIndex(int index, int val) {
        if(index>count){
            return;
        }
        if(index == count){
            addAtTail(val);
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        count++;
        Node curNode = head;
        for(int i=0; i<index-1; i++){
            curNode = curNode.next;
        }
        newNode.next = curNode.next;
        curNode.next = newNode;
    }
    
    public void deleteAtIndex(int index) {
        if(index>=count){
            return;
        }
        count--;
        if(index == 0){
            if(head==tail) tail = tail.next;
            head = head.next;
            return;
        }
        Node curNode = head;
        for(int i=0; i<index-1; i++){
            curNode = curNode.next;
        }
        curNode.next = curNode.next.next;
        if(curNode.next == null){
            tail = curNode;
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */