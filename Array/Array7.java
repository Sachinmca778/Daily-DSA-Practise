//7 print subarray 

public class Array7 {
    public static void main(String args[])
    {
        int arr[] = {2,4,6,8,10};
        printSubarray(arr); 

    }

    public static void printSubarray(int arr[])
    {
       int count =0;
        for(int i=0;i<arr.length;i++)
        {
            int si = i;
            for(int j=i ;j<arr.length;j++)
            {
                int ei =j;
                for(int k=si;k<=ei;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                count++;
                System.out.println();
            }
        }
        System.out.println("no of counts"+ count);
    }
}