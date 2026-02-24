
import java.util.Arrays;
public class kandas_subarr_sum {
 
    
     public static void sub_arr(int arr[]){
            int ms=Integer.MIN_VALUE;
            int cs=0;
           
            for(int i=0;i<arr.length;i++){
                    cs=cs+arr[i];
                  if(cs<0){
                    cs=0;
                   } 
                   ms=Math.max(cs,ms);

            }
            System.out.println(ms);

     }

        public static void main(String[] args) {
        
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
         
          sub_arr(arr);
    }
}
//but if all numbers negative so it should -1 or smallest negative
/*

import java.util.Arrays;
public class Main {
 
    
     public static void sub_arr(int arr[]){
            int ms=Integer.MIN_VALUE;
            int cs=0;
            //all neagtive
             boolean allNegative = true;
            for(int k=0;k<arr.length;k++){
                if(arr[k]>0){
                        allNegative = false;
                    } 
                    ms = Math.max(ms, arr[k]);
                }
                  if (allNegative) {
                       System.out.println(ms);
                        return;
                      }
       
            for(int i=0;i<arr.length;i++){
                    cs=cs+arr[i];
                  if(cs<0){
                    cs=0;
                   } 
                   ms=Math.max(cs,ms);

            }
             System.out.println(ms);    
            }
     
        public static void main(String[] args) {
          
              int arr[]={-2,-3,-4,-1,-2,-5,-3};
         
              sub_arr(arr);
        }
}  */