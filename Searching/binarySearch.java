import java.util.Arrays;
public class binarySearch {
     
    public static int Binary_s(int arr[],int key){
          int low=0;
          int high=arr.length-1;

        while (low<=high) {

               int mid=(low+high)/2;

            if(arr[mid]==key){
                return mid;
                
            }if(arr[mid]<key){
                 low=mid+1;
            }else{
                high=mid-1;
            }

           }
           return -1;

    }


    public static void main(String[] args) {
        int arr[]={2,3,4,6,8};
        int key=6;
       System.out.println("index for key is: "+Binary_s(arr,key));
    }
}
