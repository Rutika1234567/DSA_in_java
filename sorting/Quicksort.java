public class Quicksort {
   public static void print(int[] var0) {
      for(int var1 = 0; var1 < var0.length; ++var1) {
         System.out.print(var0[var1] + " ");
      }

      System.out.println();
   }

     public static void quick(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        //last el
        int part_ind=partition(arr,si,ei);
        quick(arr, si, part_ind-1);//left
        quick(arr, part_ind+1, ei);//right
     }
    public static int partition(int arr[],int si,int ei){
      int pivot=arr[ei];   //piv=last el
      int i=si-1;    //to make place for el smaller than pivot

     for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
           i++; 
           //swap
           int temp=arr[j];
           arr[j]=arr[i];
           arr[i]=temp;
        }
     }
     //pivot on right place
       i++; 
        int temp=pivot;
        arr[ei]=arr[i];
        arr[i]=temp;
        return i;

    } 
  

    

    public static void main(String[] args) {
        int arr[]={6,3,9,2,11};
        
        quick(arr,0,arr.length-1);
        print(arr);
    }
}
