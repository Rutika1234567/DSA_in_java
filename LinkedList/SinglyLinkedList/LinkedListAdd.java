package LinkedList.SinglyLinkedList;
public class LinkedListAdd {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addfirst(int data){
        //1=new node create
        Node newNode=new Node(data); 
        size++;
        if(head==null){
             head=tail=newNode;
             return;
        }
         newNode.next=head;   //link
         head=newNode;  
    }
    public void addLast(int data){
        Node newNode =new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
        
    }
    public void addmiddle(int idx,int data){
         if(idx==0){
            addfirst(data);
            return;
         }
        Node newNode=new Node(data);
        size++;
          Node temp=head;
          int i=0;
          while(i<idx-1){
            temp=temp.next;
            i++;
          }
          //i=idx-1 temp=prev
          newNode.next=temp.next;
          temp.next=newNode;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        Node temp=head;
        while(temp !=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LinkedListAdd ll=new LinkedListAdd();
         ll.addfirst(1);   //O(1)
         ll.print();
         ll.addfirst(2);
         ll.print();
         ll.addLast(3);
         ll.print();
          ll.addLast(5);
          ll.print();
          ll.addmiddle(3, 9);
          ll.print();
         System.out.println("size of linked list: "+ll.size);
    }
}
