//remove duplicate
public class dulicate {
    public static int duplicat(int arr[]){
            int n=arr.length;
            int newarr[]=new int[n];
            int k=0;
            for(int i=0;i<n;i++){
                boolean du=false;
                for(int j=0;j<k;j++){
                    if(arr[i]==newarr[j]){
                       du=true;
                       break;
                    }
                }
                if(!du){
                   newarr[k++]= arr[i];
                }
             
            }
               for(int i=0;i<k;i++){
                    arr[i]=newarr[i];
                }
            return k;
         }
       
       
    
       public static void main(String[] args) {
         int arr[]={1,1,2,3,4,4};
         int size=duplicat(arr);
         for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
         }
    }
}
