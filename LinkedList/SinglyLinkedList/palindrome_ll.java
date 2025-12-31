package LinkedList.SinglyLinkedList;

public class palindrome_ll {
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

 public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    private Node findMidNode(Node head){
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next !=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean checkpalindrome(){
        if(head==null || head.next==null){
            return true;
        }
        //find mid
        Node mid=findMidNode(head);
        //reverse 2nd half
         Node prev=null;
        Node curr=mid; 
        Node next;
        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node right =prev;
        Node left=head;
        //check if equal
        while(right !=null){
            if(left.data !=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        palindrome_ll ll = new palindrome_ll();

        ll.add(10);
        ll.add(20);
        ll.add(10);
        ll.add(20);
        ll.add(10);
      
        System.out.println("Original List:");
        ll.printList();

        System.out.println(ll.checkpalindrome());
    }
}
