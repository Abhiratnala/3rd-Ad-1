import java.util.*;
public class ass_07_1 {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
        private Node head=null;
        public void add(int data, int p){
            Node node=new Node(data);
            if(p==0){//beggining posiiton
                node.next=head;
                head=node;
                return;
            }
            Node temp=head;
            for(int i=0;i<p-1 && temp!=null;i++){
                temp=temp.next;
            }
            if(temp==null) {
                System.out.println("position out of range");
                return;
            }
            node.next=temp.next;
            temp.next=node;
            print();
        }
        public void delete(int p){
            if(head==null) {
                System.out.println("empty linked list");
                return;
            }
            if(p==0){
                head=head.next;
                return;
            }
            Node temp=head;
            for(int i=0;i<p-1 && temp!= null;i++)
            {
                temp=temp.next;
            }
            if(temp==null || temp.next==null) {
                System.out.println("position out of bounds");
                return;
            }
            temp.next=temp.next.next;
            print();
        }
        public boolean search(int x){
            Node temp=head;
            while(temp!=null){
                if(temp.data==x)
                    return true;
                temp=temp.next;
            }
            return false;

        }
        public void reverse(){
            Node prev=null;
            Node curr=head;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
            print();
        }
        public void print() {
            if (head == null) {
                System.out.println("empty");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" -> ");
                temp=temp.next;
            }
            System.out.print("null");
            System.out.println();
        }


        public static void main(String[] args) {
            ass_07_1 ob = new ass_07_1();
            ob.add(40,0);
            ob.add(50,1);
            ob.add(60,2);
            ob.add(70,3);
            ob.delete(2);
            System.out.println(ob.search(50));
            ob.reverse();

        }

    }



