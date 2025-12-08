public class SelectionSort {
      public static void sel(int arr[]){
        int n=arr.length;
              for(int i=0;i<n-1;i++){
                int minpos=i;
                for(int j=i+1;j<n;j++){
                     if(arr[minpos]> arr[j]){  // < soretd descending 
                              minpos=j;
                     }
                }

                int temp=arr[minpos];
                arr[minpos]=arr[i];
                arr[i]=temp;
              }
             
            }

    public static void main(String[] args) {
        int arr[]={4,3,2,11,1};
        sel(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
