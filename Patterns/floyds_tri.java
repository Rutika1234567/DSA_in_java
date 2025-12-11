public class floyds_tri {
    
   public static void floy(int n) {
    int counter=1;
               //outer line or row
         for(int i=1;i<=n;i++){
          //innner how may time counter be print
            for(int j=1;j<=i;j++){
              System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
         }
       }
      public static void main(String args[]){
        floy(5);
    }
}
