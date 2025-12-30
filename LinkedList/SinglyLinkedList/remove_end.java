package LinkedList.SinglyLinkedList;

public class remove_end {
     public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
  
    // Add node at end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void deleteNthfromEnd(int n){

        //cal size
        int size=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        if(n==size){
            head=head.next;
            return;
        }
        int i=1;
        int itofind=size-n;
        Node prev=head;
        while(i<itofind){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
         remove_end ll = new remove_end();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        System.out.println("Original List:");
        ll.printList();

        ll.deleteNthfromEnd(3);
          ll.printList();

       
    }
}
