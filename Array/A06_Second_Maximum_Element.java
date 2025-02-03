//6 Print Second Maximum Element in array

public class A06_Second_Maximum_Element {
    public static void main (String[] args)
    {
        int arr[] = {22,5,80,15};
        int secondmax = SecondMax(arr);
        System.out.println(secondmax);
        

    }

    public static int SecondMax (int arr[])
    { 
        int secondmax = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
            max = arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++)
        {
             if(arr[i]>secondmax&& max!=arr[i]){
            secondmax = arr[i];
            }

        }
        return secondmax;

    }
}