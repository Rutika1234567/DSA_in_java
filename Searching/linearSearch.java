import java.util.Arrays;


public class linearSearch {
   
    public static void linearSearch(int arr[],int key){
       
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                System.err.println(arr[i]+"  found at index: "+i);
               return;
            }
        }
         System.out.println("not found");
    }

    public static void main(String[] args) {
        
        int arr[]={11,2,3,4,5};
         int key=4;
        linearSearch(arr,key);
    }
}
