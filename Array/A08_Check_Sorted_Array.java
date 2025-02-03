//8. Check if an Array is Sorted


// Input:
// N = 5, array[] = {1,2,3,4,5}
//Output :True


public class A08_Check_Sorted_Array {
    public static void main(String[] args)
    {
        int arr[] = {1,3,5,6,7};
        boolean b =checkSort(arr);
        System.out.println(b);

    }

    public static boolean checkSort(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])      
            {
                return false;
            }
        }
        return true;
    }
}


