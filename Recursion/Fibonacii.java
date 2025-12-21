package Recursion;


public class Fibonacii {
 
      public static int fibo(int n){
          if(n==0 || n==1){
            return n;
          }
          
       int fib_1=fibo(n-1);  //1
       int fib_2=fibo(n-2); //2
        int fib_n=fib_1+fib_2;
        return fib_n;
      }

    public static void main(String[] args) {
       int n=60;
        System.out.println(fibo(n));
    }
}
