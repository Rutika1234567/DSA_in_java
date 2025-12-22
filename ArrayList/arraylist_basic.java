import java.util.ArrayList;

public class arraylist_basic {
 
    public static void main(String[] args) {
        ArrayList<Integer> list1=new ArrayList<>(); 
        ArrayList<String> list2=new ArrayList<>();
         
        list1.add(1); //O(1)
        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(9);
       System.out.println(list1);
       int el=list1.get(2);
       System.out.println(el);   //O(n)

       //delete
       list1.remove(2);
       System.out.println(list1);

       list1.set(4,10);
       System.out.println(list1);

         System.out.println(list1.contains(1));
        System.out.println(list1.size());
    }
}
