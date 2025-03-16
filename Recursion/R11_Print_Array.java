//Given an array . Print all its values recrusively.

public class R11_Print_Array {

    static void printArray(int[] arr, int idx)   //5,6,7,8
    {
        //base case
        if(idx == arr.length) {
            return;
        }

        //self work
        System.out.println(arr[idx]); //5
        
        //recursive work ---- Sub problem
        printArray(arr, idx+1); //6,7,8
    }

    public static void main (String[] args) {
        int[] arr = {5,6,7,8};
        printArray(arr,0);
    }
}