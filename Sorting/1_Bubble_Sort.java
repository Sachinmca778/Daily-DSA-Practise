//1. Bubble Sorting

public class Bubble_Sort {
    public static void main(String args[]){
        int arr[] = {25,26,10};  //array created 
        bubbleSort(arr);           //function used
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void bubbleSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++)  
        {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

    }
}