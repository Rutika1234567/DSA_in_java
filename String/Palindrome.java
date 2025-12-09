

public class Palindrome {
    
    public static void check_palindrome(String s){

            for(int i=0;i<s.length()/2;i++){
                int n=s.length();
                if(s.charAt(i)!=s.charAt(n-1-i)){
                    System.out.println(s+" is not a Palindrome");
                    return;
                }
         }
         System.out.println(s+" is a Palindrome");
         
    }
// time complexity=O(n)
    public static void main(String[] args) {
        String s="madam";
        check_palindrome(s);
        
    }
}
