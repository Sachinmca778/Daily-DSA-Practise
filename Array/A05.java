//5 Print Maximum Element in array

public class A05 {
    public static void main(String[] args)
    {
        int arr [] = {32,2,4,55,12};
        int Maximum = PrintMax(arr);
        System.out.println(Maximum);

    }

    public static int PrintMax(int arr[])
    {
        int max = Integer.MIN_VALUE;
        for(int i =0;i<arr.length ;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}