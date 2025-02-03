//11.Move all Zeros to the end of the array  (Leetcode - 283)

// Example 1:
// Input:
//  1 ,0 ,2 ,3 ,0 ,4 ,0 ,1
// Output:
//  1 ,2 ,3 ,4 ,1 ,0 ,0 ,0
// Explanation:
//  All the zeros are moved to the end and non-negative integers are moved to front by maintaining order

// Example 2:
// Input:
//  1,2,0,1,0,4,0
// Output:
//  1,2,1,4,0,0,0
// Explanation:
//  All the zeros are moved to the end and non-negative integers are moved to front by maintaining order


public class A11_MoveAllZerosToEnd_283 {
    public static void main(String[] args)
    {
        int arr[] = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        MoveZeroToEnd(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+",");
        }
    }

    public static void MoveZeroToEnd(int arr[] )
    {
        int n = arr.length;
        int count =0;
        for(int i =0 ;i<arr.length;i++){
            if(arr[i]!=0)
            {
             arr[count++] = arr[i];
            }
        }

        for(int i =count ; i<n;i++)
        {
            arr[i] = 0;
        }
        
    }
}

