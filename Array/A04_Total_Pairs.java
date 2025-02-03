//4 Print the total Pairs of Array and count the pairs.

public class A04_Total_Pairs {
    public static void main(String[] args)
    {
        int arr[] ={4,2,5};
        Pairs(arr);
    }

    public static void Pairs(int arr[]){

        for(int i=0;i<arr.length;i++)
        {
            int start = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                int end = arr[j];
                System.out.print("("+start+","+end+")");

            }
            System.out.println();
        }
    }
}