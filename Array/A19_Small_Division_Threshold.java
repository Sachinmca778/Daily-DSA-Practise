// Find the Smallest Divisor Given a Threshold (LeetCode 1283)

//Example 1:
//Input: nums = [1,2,5,9], threshold = 6
//Output: 5
//Explanation: We can choose 5 as the divisor, and the sum of the quotients is 1 + 1 + 1 + 2 = 5, which is less than or equal to the threshold.

//Example 2:
//Input: nums = [2,3,5,7,11], threshold = 11
//Output: 3
//Explanation : We can choose 3 as the divisor, and the sum of the quotients is 1 + 1 + 1 + 2 + 3 = 8, which is less than or equal to the threshold.


public class A19_Small_Division_Threshold {
    
    public static int smallestDivisor(int[] nums, int threshold) {
        int left = 1;
        int right = Integer.MIN_VALUE;

        // find the maximum possible divisor
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > right) {
                right = nums[i];
            }
        }

        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (isDivisionPossible(nums, mid, threshold)) {
                result = mid; // Found a valid divisor
                right = mid - 1; // Try to find a smaller divisor
            } else {
                left = mid + 1; // Increase the divisor
            }
        }

        return result;
    }

    private static boolean isDivisionPossible(int[] nums, int divisor, int threshold) {
        int sumOfDivison = 0;

        for(int i=0; i<nums.length; i++) {
            sumOfDivison += nums[i] / divisor;
            if (nums[i] % divisor != 0) {
                sumOfDivison+=1; // If there's a remainder, we need to round up
            }
            if(sumOfDivison > threshold) {
                return false; // If the sum exceeds the threshold, return false
            }
        }

        return true; // If we reach here, the divisor is valid
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 9};
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold)); // Output: 5
    }
}

