package String;
import java.util.Arrays;
public class QS4 {
      
    public static void main(String[] args) {
           String s="care";
           String s2="Race";
       
            s=s.toLowerCase();
            s2=s2.toLowerCase();
        if(s.length()==s2.length()){
           char[] sarray=s.toCharArray();
           char[] s1array=s2.toCharArray();

           Arrays.sort(sarray);
           Arrays.sort(s1array);

        boolean result=Arrays.equals(sarray,s1array);
        if(result){
            System.out.println(s+" and "+s2+" are anagrams of each other.");
        }else{
            System.out.println(s+" and "+s2+" are not anagrams of each other.");
          }
        }else{
            System.out.println(s+" and "+s2+" are not anagrams of each other.");
        
        }
    }
}
