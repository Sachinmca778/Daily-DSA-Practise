//2 Selection Sort

public class 2_Selection_Sort {
    public static void main(String args[]){
        int arr[] = {25,26,10};  //array created 
        selectionSort(arr);           //function used
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }

    public static void selectionSort(int arr[]) {
        for(int i=0;i<arr.length-1;i++)  
        {
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

    }
}


//Concept
//Selection sort mai ek element ko select karte hai aur usko sabse chota element se swap karte hai
//Aur fir uske baad usko next element se compare karte hai aur usko swap karte hai
//Aur fir usko next element se compare karte hai aur usko swap karte hai





