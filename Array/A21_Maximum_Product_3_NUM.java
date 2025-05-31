//  Maximum Product of Three Numbers (Leetcode 628)

//Example 1:
//Input: nums = [-10, -10, 5, 2]
//Output: 500
//Explanation: The maximum product can be obtained by multiplying -10, -10, and 5, which gives 500.


//Example 2:
//Input: nums = [1, 2, 3]
//Output: 6

import java.util.Arrays;

public class A21_Maximum_Product_3_NUM {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3]; // last 3 largest numbers
        int product2 = nums[0] * nums[1] * nums[n - 1]; // 2 smallest and the largest

        return Math.max(product1, product2);
    }

    // Test the solution
    public static void main(String[] args) {
        A21_Maximum_Product_3_NUM sol = new A21_Maximum_Product_3_NUM();
        int[] nums1 = {-10, -10, 5, 2};
        System.out.println(sol.maximumProduct(nums1)); // Output: 500

        int[] nums2 = {1, 2, 3};
        System.out.println(sol.maximumProduct(nums2)); // Output: 6
    }
}
