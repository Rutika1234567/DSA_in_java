import java.util.Scanner;
class  SecondHighestElement{
    public static void main(String[] args) {
       int arr[]={2,3,4,0,9,21};
       int max=Integer.MIN_VALUE;
       int secondmax = Integer.MIN_VALUE;
       
       for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              secondmax=max;
              max=arr[i];
          } else if (arr[i] > secondmax && arr[i] != max) {
                secondmax = arr[i];
            }
       }
          System.out.println("Second Highest: " + secondmax);
           
      
    }
}