//162. Find Peak Element (Leetcode)

// A peak element is an element that is strictly greater than its neighbors.
// Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
// You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.
// You must write an algorithm that runs in O(log n) time.

// Example 1:
// Input: nums = [1,2,3,1]
// Output: 2
// Explanation: 3 is a peak element and your function should return the index number 2.


// Example 2:
// Input: nums = [1,2,1,3,5,6,4]
// Output: 5
// Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.  

//brute force approach:  -- O(n)
// public class A14_Find_Peak_Element_162 {
//     public static void main(String[] args)
//     {
//         int arr[] = {1,2,3,1};
//         int result = findPeakElement(arr);
//         System.out.println(result);
//     }

//     public static int findPeakElement(int[] nums) {
//         int n = nums.length;
//         for(int i=0;i<n;i++){
//             if(i==0 && nums[i]>nums[i+1]){
//                 return i;
//             }
//             if(i==n-1 && nums[i]>nums[i-1]){
//                 return i;
//             }
//             if(i>0 && i<n-1 && nums[i]>nums[i-1] && nums[i]>nums[i+1]){
//                 return i;
//             }
//         }    
//         return -1;
//     }
// }


//Optimal Approach:   -- O(logn) --- Binary Search
public class A14_Find_Peak_Element_162 {
    public static void main(String[] args)
    {
        int arr[] = {1,2,3,1};
        int result = findPeakElement(arr);
        System.out.println(result);
    }

    public static int findPeakElement(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}

//Step wise solution:
// 1.Start and End Set Karo – start = 0 aur end = n-1 rakho (array ke first aur last index).
// 2.Loop Chalao Jab Tak Start < End – Jab tak start < end hai, tab tak loop chalao.
// 3.Middle Element Nikalo – mid = start + (end - start) / 2 se middle index find karo.
// 4.Check Karo Ki Mid Increasing Hai Ya Decreasing
// 5.Agar nums[mid] < nums[mid+1], iska matlab peak right side pe hai, toh start = mid + 1 karo.
// Nahi toh peak left side ya mid pe hi hai, toh end = mid karo.
// Loop End Hone Ke Baad – Jab loop ruk jayega, start index hi peak element hoga, toh return start.
