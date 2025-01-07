public class ass_08_1 {
    private int[] stack;
    private int top;
    private int capacity;
    ass_08_1(int size){
        stack=new int[size];
        top=-1;
        capacity=size;
    }
    public void push(int data){
        if(top==capacity-1){
            System.out.println("overflow");
            return;
        }
        stack[++top]=data;
        print();
    }
    public void pop(){
        if(top==-1) {
            System.out.println("underflow");
            return;
        }
        System.out.println("element removed= "+stack[top--]);
        print();
    }
    public void top(){
        if(top==-1) {
            System.out.println("empty");
            return;
        }
        System.out.println( stack[top]);
    }
    public boolean isEmpty(){
        if(top==-1)
            return true;
        return false;
    }
    public int size(){
        return top+1;
    }
    public void print(){
        for(int i:stack ){
            System.out.print(i+"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ass_08_1 ob=new ass_08_1(5);
        ob.push(20);
        ob.push(50);
        ob.push(40);
        ob.push(30);
        ob.push(10);
        ob.push(80);
        ob.pop();
        ob.pop();
      ob.top();
        System.out.println(ob.isEmpty());
        System.out.println(ob.size());

    }

}
