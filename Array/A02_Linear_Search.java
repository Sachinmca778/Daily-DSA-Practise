// 2. Linear Search 


public class A02_Linear_Search {
    public static void main (String args[])
    {
        int arr[] = { 2,7,3,0,5};
      int  index = LinerSearchIndex(arr,3);
        System.out.println(index);
    }

    public static int LinerSearchIndex (int arr[],int target)
    {
        for( int i=0;i<arr.length ;i++)
        {
            if(arr[i]==target)
            {
                return i;

            }
        }
        return 0;
    }
}