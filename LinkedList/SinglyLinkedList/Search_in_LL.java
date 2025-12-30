package LinkedList.SinglyLinkedList;

public class Search_in_LL {

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

    // Iterative search
    public int itr_search(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    //recursive search
    public int helper(Node head,int key){
        //base  O(n)
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
         }
        int idx=helper(head.next, key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
     public int recu_search(int key){
        return helper(head,key);
     }

    public static void main(String[] args) {
        Search_in_LL ll = new Search_in_LL();

        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

      //  System.out.println(ll.itr_search(30)); 
      //  System.out.println(ll.itr_search(3)); 
        System.out.println(ll.recu_search(40)); 


    }
}
