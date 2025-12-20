
public class String_subset {
    
      public static void sub(String str,String ans,int i){
          if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);
            }
            return;
          }
          //yes
          sub(str,ans+str.charAt(i),i+1);
          //no
            sub(str,ans,i+1);
      }

    public static void main(String[] args) {
        String str="abc";
        sub(str,"",0);
    }
}
//time com=O(n*2*n)   space=O(n) stack mai n level