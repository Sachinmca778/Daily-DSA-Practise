//Search in Rotated Sorted Array II (Leetcode 81)
//Example 1:
//Input: nums = [2,5,6,0,0,1,2], target = 0
//Output: true
//Explanation: The original array was [0,0,1,2,2,5,6] and it was rotated 3 times.

//Example 2:
//Input: nums = [2,5,6,0,0,1,2], target = 3
//Output: false
//Explanation: The original array was [0,0,1,2,2,5,6] and it was rotated 3 times.

//Example 3:
//Input: nums = [1,1,1,3,1], target = 3
//Output: true
//Explanation: The original array was [1,1,1,3,1] and it was rotated 0 times.


public class A18_RotatedSortedArraySearch {

    // 🔍 Method to search in rotated sorted array with duplicates
    public static boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // ✅ Found the target
            if (nums[mid] == target) return true;

            // ⚠️ Handle duplicates
            if (nums[left] == nums[mid] && nums[mid] == nums[right]) {
                left++;
                right--;
            }
            // ✅ Left half is sorted
            else if (nums[left] <= nums[mid]) {
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1; // target in left half
                } else {
                    left = mid + 1; // target in right half
                }
            }
            // ✅ Right half is sorted
            else {
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1; // target in right half
                } else {
                    right = mid - 1; // target in left half
                }
            }
        }

        return false; // Target not found
    }

    // 🧪 Main method to test the function
    public static void main(String[] args) {
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        System.out.println("Target " + target1 + " found? " + search(nums1, target1)); // true

        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        int target2 = 3;
        System.out.println("Target " + target2 + " found? " + search(nums2, target2)); // false

        int[] nums3 = {1, 1, 1, 3, 1};
        int target3 = 3;
        System.out.println("Target " + target3 + " found? " + search(nums3, target3)); // true
    }
}
