 
 public class InsertionSort{

 
 public static void inser(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int curr=arr[i];
            int prev=i-1;
            //finding correct position
            while(prev >= 0 && arr[prev] > curr){
                 arr[prev+1]=arr[prev];
                 prev--;
            }
           //insertion
           arr[prev+1]=curr;
        }

      }

    public static void main(String[] args) {
        int arr[]={4,3,2,11,1};
        inser(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

