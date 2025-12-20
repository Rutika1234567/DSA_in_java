
public class str_permutation {

     public static void per(String s,String ans){
         if(s.length()==0){
           System.out.println(ans);
            return;
         }
         //recursion tim=O(n*n!)
         for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            //abc= a+ c
            String newstr=s.substring(0,i)+s.substring(i+1);
            per(newstr,ans+curr);

         }
     }


    public static void main(String[] args) {
        String s="abc";
        per(s,"");


    }
}
