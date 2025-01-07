public class ass_09_2 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node front;
    private Node rear;
    private int count;
    ass_09_2(){
        front=null;
        rear=null;
        count=0;
    }
    public void enqueue(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            front = node;
            rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        count++;
        print();
    }
    public int dequeue(){
        if(isEmpty()){
            System.out.println("empty");
            return -1;
        }
        int item=front.data;
        front=front.next;
        count--;
        if(front==null){
            rear=null;
        }
        System.out.println("removed "+item);
        print();
        return item;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("empty queue");
            return -1;
        }
        return front.data;
    }
    public boolean isEmpty(){
        return (front==null);
    }
    public int size(){
        return count;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("empty queue");
            return;
        }
        else{
            Node curr=front;
            while(curr!=null){
                System.out.print(curr.data+",");
                curr=curr.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        ass_09_2 ob = new ass_09_2();
        ob.enqueue(50);
        ob.enqueue(40);
        ob.enqueue(20);
        ob.enqueue(10);
        ob.enqueue(90);
        ob.dequeue();
        ob.dequeue();
        ob.isEmpty();
    }
}
