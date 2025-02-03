//1. Print Our Marks increasing by 1.

public class A01_Print_Marks_Increasing_1{

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
