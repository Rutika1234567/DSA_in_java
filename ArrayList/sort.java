package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(8);
        list.add(11);
        list.add(4);
        list.add(1);
         System.out.println(list);
        Collections.sort(list);  //ascending
        System.out.println(list);
        //descending
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
