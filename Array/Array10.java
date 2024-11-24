//10.Count Maximum Consecutive One's in the array (Leetcode - 485)


// Problem Statement: Given an array that contains only 1 and 0 return the count of maximum consecutive ones in the array.


// Example 1:

// Input: prices = {1, 1, 0, 1, 1, 1}
// Output: 3
// Explanation: There are two consecutive 1’s and three consecutive 1’s in the array out of which maximum is 3.

// Input: prices = {1, 0, 1, 1, 0, 1} 
// Output: 2
// Explanation: There are two consecutive 1's in the array.



public class Array10 {
    public static void main(String[] args)
    {
        int arr[] ={1, 0, 1, 1, 0, 1};
        int maxCount=CountConsecOnes(arr);
        System.out.println(maxCount);

    }

    public static int CountConsecOnes(int arr[])
    {
        int count =0;
        int maxcount = 0;
        for(int i =0 ;i<arr.length;i++)
        {
            count++;
            if(arr[i]!=1)
            {
                count =0;
            }
            maxcount = Math.max(count,maxcount);
        }
        return maxcount;
    }
}

