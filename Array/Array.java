//1. Print Our Marks increasing by 1.

public class Array{

    public static void main(String args[]){
        int arr[] = {25,26,10};  //array created 
        updateMarks(arr);           //function used
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void updateMarks(int arr[]) {
        for(int i=0;i<arr.length;i++)  
        {
            arr[i]= arr[i]+1;
        }

    }
}


//2. Linear Search 

public class Array {
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

//3 Binary Search 

public class Array{
    public static void main (String[] args){
        int arr [] = {2,3,9,11,13};
        int index = BinarySearch(arr,9);
        System.out.println(index);


    }

    public static int BinarySearch(int arr[], int target){
        int start = 0;
        int end = arr.length-1;
        int mid = (start + end)/2;
        while(start < end){
            if(arr[mid] == target){
                return mid;
            }
            if( arr[mid]<target){
                start = mid +1;
            }else {
                end = mid -1;
            }
            start++;
            end--;
        }
        return 0;
    }
}

//4 Print the total Pairs of Array and count the pairs.

public class Array {
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

//5 Print Maximum Element in array

public class Array {
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

//6 Print Second Maximum Element in array

public class Array {
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

//7 print subarray 

public class Array {
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




