public class inverted_tri {

       public static void invert(int n){
        for(int i=1;i<=n;i++){
            //space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=1;j<=i;j++){
                 System.out.print("*");
            }
            System.out.println();
        }
        
       }

    public static void main(String[] args) {
        invert(4);
    }
}
