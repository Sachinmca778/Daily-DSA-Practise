//12. Remove Duplicates in-place from Sorted Array


// Problem Statement: Given an integer array sorted in non-decreasing order, remove the duplicates in place such that each unique element appears only once. The relative order of the elements should be kept the same.

// If there are k elements after removing the duplicates, then the first k elements of the array should hold the final result. It does not matter what you leave beyond the first k elements.

// Example 1:
// Input:
//  arr[1,1,2,2,2,3,3]

// Output:
//  arr[1,2,3,_,_,_,_]

// Explanation:
//  Total number of unique elements are 3, i.e[1,2,3] and Therefore return 3 after assigning [1,2,3] in the beginning of the array.

// Example 2:
// Input:
//  arr[1,1,1,2,2,3,3,3,3,4,4]

// Output:
//  arr[1,2,3,4,_,_,_,_,_,_,_]

// Explanation:
//  Total number of unique elements are 4, i.e[1,2,3,4] and Therefore return 4 after assigning [1,2,3,4] in the beginning of the array.


public class A12 {
    public static void main(String[] args)
    {
        int arr[] = {1,1,2,2,2,3,3};
        RemoveDuplicate(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
        }
    }

    public static void RemoveDuplicate(int arr[])
    {
        int temp = arr[0];
        arr[0] = temp;
        for(int i=1;i<arr.length;i++)
        {
            int count =0;

            if(arr[i-1]<arr[i] && arr[i-1]!=arr[i])
            {
                arr[count++] = arr[i];
            }
        }

    }
}