
 class palindrome{
public static void main(String[] args) {
      int num=121;
      int n=num;
      int reverse=0;
      while(num>0){
         int rem=num%10;
         reverse=reverse*10+rem;
         num=num/10;
      }
      if(n==reverse){
       System.out.println("true");
      }else{
        System.out.println("false");
      }
   }

}