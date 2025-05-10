//Series Sum
//Example 1:
//Input: n = 5
//Output: 15
//Explanation: 1 + 2 + 3 + 4 + 5 = 15

//Example 2:
//Input: n = 6
//Output: 21
//Explanation: 1 + 2 + 3 + 4 + 5 + 6 = 21

//TC : O(n)
//SC : O(n)
import java.util.Scanner;
public class R8_Series_Sum {
    static int series_sum(int n ){
         if(n==0){
             return 0;
         }
         return series_sum(n-1) +n ;
     }
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(series_sum(n));
	}
}

