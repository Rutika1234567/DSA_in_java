
import java.util.Arrays;
public class pair_arr {
    
      public static void pair(int arr[]){
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+" "+arr[j]+")");
            }
        }
      }
    
    public static void main(String[] args) {
        
        int arr[]={11,2,3,4,5};
         
         pair(arr);
    }
}
// time compl O(n^2)   no_of_pair=n(n+1)/2