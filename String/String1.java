package String;
//Count how many times lowercase vowels occurred in a String entered by th
import java.util.Scanner;
public class String1 {
      
    public static void main(String[] args) {
        Scanner  scan=new Scanner(System.in);
        System.out.println("enter a string: ");

        String s=scan.nextLine();
           int count =0;
           for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='u' || ch=='a' ||ch=='i' || ch=='e' || ch=='o'){
                count++;
            }
           }
           System.out.println(count);
    }
}
