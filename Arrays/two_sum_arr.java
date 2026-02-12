import java.util.Arrays;

class two_sum_arr {
    public static int[] twoSum(int[] numbers, int target) {
     
     int left=0;
     int right=numbers.length-1;
     while(left<right){
          int sum=numbers[left]+numbers[right];
        if(sum==target){
              return new int[]{left+1,right+1};
        }else if(sum<target){
             left++;
        }else{
            right--;
        }
      }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int numbers[]={1,3,30,35,98};
        int target=33;
        System.out.println(Arrays.toString(twoSum(numbers,target)));

    }
}