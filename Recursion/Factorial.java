package Recursion;

import java.util.Scanner;
public class Factorial {  
       public static int fact(int n) {
            if(n==0){
                return 1;
            }
            int fnm1=fact(n-1);
            int fn=n*fnm1;
            return fn;
        }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n=scan.nextInt();
        System.out.println("The factorial of number is : "+fact(n));
        
    }
}
