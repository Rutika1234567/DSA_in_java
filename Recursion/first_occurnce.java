package Recursion;

public class first_occurnce {
    public static int find_occ(int arr[],int key,int i){
          //base case 
        if(i==arr.length-1){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return find_occ(arr, key,i+1);
    
    }

    public static void main(String[] args) {
         int arr[]={6,3,4,5,1,5};
        int key=5;
        System.out.println(find_occ(arr,key,0));
    }
}
