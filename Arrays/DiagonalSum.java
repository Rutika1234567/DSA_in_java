public class DiagonalSum {
    

    public static void Dia_sum(int m[][]) {
        int sum=0;
        int n=m.length;
        // time complexity=o(n^2) 
        /* 
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(i==j){
                    sum+=m[i][j];
                }else if(i+j==n-1){
                    sum+=m[i][j];
                }
            }      
        }
        System.out.print(sum);  
*/
        // time complexity=o(n)
     for(int i=0;i<n;i++){
        sum+=m[i][i];
        if(i != n-1-i){
            sum+=m[i][n-i-1];
        }
     }
     System.out.print(sum);  
        
    }
    public static void main(String[] args) {
        int m[][]={
            {1,2},
            {1,2}
        };
        Dia_sum(m);
    }
}
