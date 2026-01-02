public class Add_doublell {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    //add
    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;

    }
     public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        } 
        tail.next=newNode;
        tail=newNode;
        newNode.next=null;
    }
    
    public void print(){
        Node temp=head;
        while(temp != null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
         Add_doublell dll=new Add_doublell();
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1);
           dll.addFirst(0);
         dll.print();
          System.out.println(dll.size); 
        dll.addLast(6);
         dll.print();
         


    }
}
