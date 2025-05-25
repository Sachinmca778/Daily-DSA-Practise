//Kth Missing Positive Number (Leetcode 1539)

//Example 1:
//Input: arr = [2,3,4,7,11], k = 5
//Output: 9
//Explanation: The missing positive integers are [1,5,6,8,9,10,...]. The 5th missing positive integer is 9.

//Example 2:
//Input: arr = [1,2,3,4], k = 2
//Output: 6
//Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.

public class A17_Kth_Missing_Positive_Number_1539 {


    //Optimal Approach (Binary Search)
    public int findKthPositive(int[] arr, int k) {

        int left =0;
        int right = arr.length -1;
        int mid =-1;

        while(left<=right) {
            mid = left + (right - left)/2;
            
            int no_of_missing_number = arr[mid] - (mid+1);

            if(no_of_missing_number < k) {
                left = mid+1;
            }else{
                right =mid-1;
            }
        }

        return left + k;
    }


    //Brute Force (Apprach 1)
    // public int findKthPositive(int[] arr, int k) {
    //     int nums = 1;
    //     int i = 0;
    //     while (k > 0) {
    //         if (i < arr.length && nums == arr[i]) {
    //             i++; 
    //         } else {
    //             k--; 
    //             if (k == 0) return nums;
    //         }
    //         nums++;
    //     }
    //     return nums;
    // }

    public static void main(String[] args) {
        A17_Kth_Missing_Positive_Number_1539 solution = new A17_Kth_Missing_Positive_Number_1539();
        int[] arr1 = {2, 3, 4, 7, 11};
        int k1 = 5;
        System.out.println(solution.findKthPositive(arr1, k1)); // Output: 9

        int[] arr2 = {1, 2, 3, 4};
        int k2 = 2;
        System.out.println(solution.findKthPositive(arr2, k2)); // Output: 6
    }
}