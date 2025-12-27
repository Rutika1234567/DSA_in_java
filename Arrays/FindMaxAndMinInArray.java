import java.util.Scanner;
class FindMaxAndMinInArray{
    public static void main(String[] args) {
       int arr[]={22,3,4,0,4,89,32,45};
       int max=arr[0];
       int min=arr[0];
       for(int i=0;i<arr.length;i++){
          if(arr[i]>max){
              max=arr[i];
          } if(arr[i]<min){
              min=arr[i];
          }
       }
          System.out.println(max);
           System.out.println(min);
     
      
    }
}