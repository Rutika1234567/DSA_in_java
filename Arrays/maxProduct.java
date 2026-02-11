public class maxProduct {
    
    public static int maxProduct(int[] nums) {
     int max1=0;
     int max2=0;
     for(int curr=0;curr<nums.length;curr++){
            if(nums[curr]>max1){
              
                max2=max1;
                  max1=nums[curr];
            }
            else if(nums[curr]>max2){
                max2=nums[curr];
            }
     }
     return ((max1-1)*(max2-1));
    } 
    public static void main(String[] args) {
        int nums[]={1,4,53,21,6};
        System.out.println(maxProduct(nums));
    }
}