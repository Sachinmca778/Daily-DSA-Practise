//Print  the maximum value in an array.

//example:
// input: arr[] = {1,2,3,4,5}
// output: 5
// input: arr[] = {1,2,3,4,5,6,7,8,9,10}
// output: 10
//TC : O(n)
//SC : O(n)

import java.util.Scanner;
public class R12_Maximum_Value {
    static int maxValue(int[] arr, int idx) {
        //Base Case
        if(idx == arr.length-1) {
            return arr[idx];
        }
        //Recursive Work
        int smallAns = maxValue(arr, idx+1);
        //Self Work
        return Math.max(arr[idx], smallAns);

    }
    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,10};
        System.out.println(maxValue(arr,0));
    }
}