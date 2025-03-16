//Longest Sub-Array with Sum K   (GFG)   -- Medium

// Problem Statement: Given an array arr[] containing integers and an integer k, your task is to find the length of the longest subarray where the sum of its elements is equal to the given value k. It is guaranteed that a valid subarray exists.

// Example 1:Input: arr[] = [10, 5, 2, 7, 1, 9], k = 15
// Output: 4
// Explanation: The subarray [5, 2, 7, 1] has a sum of 15 and length 4.

// Example 2:Input: arr[] = [-1, 2, -3], k = -2
// Output: 3
// Explanation: The subarray [-1, 2, -3] has a sum of -2 and length 3.

//Brute Force Approach: (Write Own Code)  -- O(n^2)

// public class A13_Longest_Subarray_with_Sum_K {  
//     public static void main(String[] args)
//     {
//         int arr[] = {10, 5, 2, 7, 1, 9};
//         int k = 15;
//         int result = lenOfLongestSubarr(arr,k);
//         System.out.println(result);
//     }

//     public static int lenOfLongestSubarr(int[] arr, int k) {
//         int n = arr.length;
//         int  maxcount =0;
//         for(int i=0;i<n;i++){
//             int start = arr[i];
//             int end =0;
//             int count =0;
//             for(int j=i+1;j<n;j++){
//                  end=end + arr[j];
//                 int sum = start + end;
//                 count++;    
//                 if(sum == k){
//                     maxcount = Math.max(count,maxcount);
//                 }
//             }
//         }
//         return maxcount+1;
//     }
// }

//Optimal Approach:   -- O(n)
import java.util.HashMap;
public class A13_Longest_Subarray_with_Sum_K {  
    public static void main(String[] args)
    {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k = 15;
        int result = lenOfLongestSubarr(arr,k);
        System.out.println(result);
    }

    public static int lenOfLongestSubarr(int[] arr, int k) {
        int n = arr.length;
        int  maxcount =0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            if(sum == k){
                maxcount = i+1;
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            if(map.containsKey(sum-k)){
                maxcount = Math.max(maxcount,i-map.get(sum-k));
            }
        }
        return maxcount;
    }
}


//Steps to Solve the Problem: