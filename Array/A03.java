//3 Binary Search 

public class A03{
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