package Recursion;

public class BinaryString {
       public static void printbinstr(int n,int lastplace,String str){
            if(n==0){
                System.out.println(str);
                return;
            }
            printbinstr(n-1, 0, str+"0");
            if(lastplace==0){
                 //sit 0 on chair n
                printbinstr(n-1, 1, str+"1");
            }
            
         }
   public static void main(String[] args) {
    printbinstr(3, 0, "");
   } 
}
