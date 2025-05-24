//Q.16 Find Minimum in Rotated Sorted Array (Leetcode 153)

//Example 1:
//Input: nums = [3,4,5,1,2]
//Output: 1
//Explanation: The original array was [1,2,3,4,5] rotated 3 times.

//Example 2:
//Input: nums = [4,5,6,7,0,1,2]
//Output: 0
//Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

//Optimal Approach: (Binary Search)
//Time Complexity: O(log n)
//Space Complexity: O(1)


public class A16_Find_Minimum_in_Rotated_Sorted_Array_153 {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid is greater than the rightmost element
            if (nums[mid] > nums[right]) {
                left = mid + 1; // Minimum is in the right half
            } else {
                right = mid; // Minimum is in the left half or at mid
            }
        }

        return nums[left]; // The minimum element
    }

    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 1, 2};
        A16_Find_Minimum_in_Rotated_Sorted_Array_153 obj = new A16_Find_Minimum_in_Rotated_Sorted_Array_153(); // Create an instance
        int result = obj.findMin(arr); // Call the method on the instance
        System.out.println(result);
    }
}


//Brute Force Approach: (Personal Approach) - solve problem without see any resource.
// public class A16_Find_Minimum_in_Rotated_Sorted_Array_153 {

//     public int findMin(int[] nums) {
        
//         int count =1 ;
//         int n = nums.length -1;
//         for(int i =0; i<=n -1 ; i++ ) {
//             if(nums[i] > nums[i+1]) {
//                 break;
//             }
//             count++;
//         }

//         for(int i=0; i<count ; i++ ) {
//             rotateArray(nums);
//         }

//         return nums[0];
//     }

//     static void rotateArray(int[] nums) {
//         int temp = nums[0];
//         for(int i =0 ; i<nums.length -1 ; i ++) {
//             nums[i] = nums[i+1];
//         }

//         nums[nums.length-1] = temp;
//     }

//     public static void main(String[] args) {
//         int arr[] = {3,4,5,1,2};
//         A16_Find_Minimum_in_Rotated_Sorted_Array_153 obj = new A16_Find_Minimum_in_Rotated_Sorted_Array_153(); // Create an instance
//         int result = obj.findMin(arr); // Call the method on the instance
//         System.out.println(result);
//     }
// }