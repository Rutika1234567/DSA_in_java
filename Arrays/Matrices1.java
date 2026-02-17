import java.util.Scanner;
public class Matrices1 {

    public static boolean search(int matrix[][],int key) {
          for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                 if(matrix[i][j]==key){
                    System.out.println("("+i+","+j+")"+":found at this cell");
                        return true;
                 }
            }
          
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
       int matrix[][]=new int[3][3];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                  matrix[i][j]=scan.nextInt();
            }
        }
     

         for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                  System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
         search(matrix,5 );
    }
}
