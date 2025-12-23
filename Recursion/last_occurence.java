package Recursion;

public class last_occurence {
    public static int find_occ(int arr[],int key,int i){
          //base case 
        if(i==-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return find_occ(arr, key,i-1);
    
    }

    public static void main(String[] args) {
         int arr[]={3,3,4,5,1,5,4,1,3};
        int key=3;
        System.out.println(find_occ(arr,key,arr.length-1));
    }

}
