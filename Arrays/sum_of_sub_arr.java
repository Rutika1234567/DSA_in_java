import java.util.Arrays;
public class sum_of_sub_arr {
   
      public static void sum_sub(int arr[]) {
           int currsum=0;
           int maxSum=Integer.MIN_VALUE;

            for(int i=0;i<arr.length;i++){
                for(int j=i;j<arr.length;j++){
                  currsum=0;
                     for(int k=i;k<=j;k++){  
                        // sum of subarray
                        currsum+=arr[k];
                     }
                     System.out.println(currsum);
                     if(maxSum < currsum){
                        maxSum=currsum;
                     }
                     
                }
               
            }
            System.out.println(maxSum);
      }

    public static void main(String[] args) {
        
        int arr[]={2,4,6,8,10};
         
          sum_sub(arr);
    }
}


// time com o(n^3)