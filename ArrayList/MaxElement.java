package ArrayList;

import java.util.ArrayList;

public class MaxElement {
   public static void main(String[] args) {   
           //O(n)
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(34);
        list.add(11);
        list.add(19);
        list.add(20);
        int max_el=Integer.MIN_VALUE;
        for(int i=0;i<list.size();i++){
            if(list.get(i) > max_el){
               max_el=list.get(i);
            }
            //max_el=Math.max(max_el,list.get(i))   
        }
        System.out.println(max_el);
    } 
}
