
public class Remove_doublell {
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
    public int remove_first(){
        if(head==null){
           System.out.println("DLL is empty"); 
            return Integer.MIN_VALUE;
        }
        if(size==1){
              int val=head.data;
              head=tail=null;
              size--;
              return val;
        }
        int val=head.data;
        head=head.next;
         head.prev=null;  
         size--;    
         return val;
    }
    public void remove_last(){
        if(head==null){
            return;
        }
        if(head==tail){
            head=tail=null;
            return;
        }
         tail = tail.prev;
        tail.next = null;
       
        return;
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
         Remove_doublell dll=new Remove_doublell();
         dll.addFirst(3);
         dll.addFirst(2);
         dll.addFirst(1);
         dll.addFirst(0);

          dll.print();
          dll.remove_first();
          dll.print();


          dll.remove_last();
            dll.print();
        }


}
