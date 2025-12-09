public class SprialMatrix {
     
    public static void Sprial(int matrix[][]) {
        int startrow=0,endrow=matrix.length-1;
        int startcol=0,endcol=matrix[0].length-1;
        while(startrow <=endrow && startcol <= endcol){
          //col 1st :1 2 3 4 startrow=constant
            for(int j=startcol;j<=endcol;j++){
                  System.out.println(matrix[startrow][j]+" ");
                 
            }
            //right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.println(matrix[i][endcol]+" ");
            }
            //bottom
           for(int j=endcol-1;j>=startcol;j--){
                
                  if(startcol==endcol){
                    break;
                  }
                  System.out.println(matrix[endrow][j]+" ");
                 
            }
            //left
            for(int i=endrow-1;i>=startrow+1;i--){
                System.out.println(matrix[i][startcol]+" ");
            }
          startcol++;
          startrow++;
          endcol--;
          endrow--;
        }
        System.out.println();
    }

public static void main(String[] args) {
        int matrix[][]={
             {1,2,3,4},
             {5,6,7,8},
             {9,10,11,12},
             {13,14,15,16}
        };

        Sprial(matrix);


}

    
}
