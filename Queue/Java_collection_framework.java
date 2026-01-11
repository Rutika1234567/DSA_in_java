import java.util.*;

public class Java_collection_framework {

     
    
    public static void main(String[] args) {
       //  Queue q=new Queue();
       
      // Queue<Integer> q=new LinkedList<>(); //ArrayQueue
        Queue<Integer> q=new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            
            System.out.println(q.peek());
            q.remove();
        }
    }
}
