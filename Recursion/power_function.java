package Recursion;

public class power_function {
    public static int print_power(int x,int n){ //o(logn)
        //base case
        if(n==0){
            return 1;
        }
      int xnm1=print_power(x,n-1);
      int xn=x*xnm1; 
      return xn;
    }
    public static int optimizedPower(int a,int n){
      if(n==0){
          return 1;
      }
     int halfpow=optimizedPower(a, n/2);
     int halfpowsq=halfpow*halfpow;
     if(n%2 !=0){
        halfpowsq=a*halfpowsq;
     }
     return halfpowsq;
    }

public static void main(String[] args) {
    
    System.out.println(print_power(2,10));
     System.out.println(optimizedPower(2, 10));  
   }

}
