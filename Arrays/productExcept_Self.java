import java.util.*;

public class productExcept_Self {

    public static int[] productExceptSelf(int[] nums) {

        int n = nums.length;

        if (nums == null || n == 0) {
            return new int[0];
        }

        int rp = 1;
        int ans[] = new int[n];

       
        for (int i = 0; i < n; i++) {
            ans[i] = rp;
            rp = rp * nums[i];
        }

       
        rp = 1;

        for (int i = n - 1; i >= 0; i--) {
            ans[i] = rp * ans[i];
            rp = rp * nums[i];
        }

        return ans;
    }

    public static void main(String[] args) {

        int nums[] = {1, 2, 3, 4};

        int result[] = productExceptSelf(nums);

        System.out.println("Output:");

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}