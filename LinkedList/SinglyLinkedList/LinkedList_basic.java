package LinkedList.SinglyLinkedList;

public class LinkedList_basic {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;   //declarations of reference variables (pointers) 
    public static Node tail;

public static void main(String[] args) {
    LinkedList_basic  ll=new LinkedList_basic();
           ll.head=new Node(1);
    
    }
}
