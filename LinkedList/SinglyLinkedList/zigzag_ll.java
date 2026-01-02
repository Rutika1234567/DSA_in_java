public class zigzag_ll {
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
    public void reverse(){  //o(n)
        Node prev=null;
        Node curr=head;
        Node next;

        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

  public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void zigzag(){
          //find mid
             Node slow=head;
             Node fast=head.next;

             while(fast !=null && fast.next !=null){
                slow=slow.next;
                fast=fast.next.next;
             }
             Node mid=slow;
          //reverse 2nd half
          Node curr=mid.next;
          mid.next=null;
          Node prev=null;
          Node next;
            
          while(curr !=null){
             next=curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
          }
          Node left =head;
          Node right=prev;
          Node nextL,nextR;
          //alt merge -zig zag merge
          while(left !=null && right !=null){
            nextL=left.next;
            left.next=right;
            nextR=right.next;
            right.next=nextL;

            left=nextL;
            right=nextR;
          }
    }      

    
    public static void main(String[] args){
       zigzag_ll ll=new zigzag_ll();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

        System.out.println("Original List:");
        ll.printList();
         ll.zigzag();
        ll.printList();
    }
}
