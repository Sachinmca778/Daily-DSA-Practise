//Alternate Series Sum
//Example 1:
//Input: n = 5
//Output: 3
//Explanation: 1 - 2 + 3 - 4 + 5 = 3

//Example 2:
//Input: n = 6
//Output: -3
//Explanation: 1 - 2 + 3 - 4 + 5 - 6 = -3

//TC : O(n)
//SC : O(n)


import java.util.Scanner;
public class R9_Alternate_Series_Sum {

    static int alternateSeriesSum(int n) {
        //Base case
        if(n==0) {
            return 0;
        }
        if(n%2==0) { //Even
            return alternateSeriesSum(n-1) - n;
        }
        else { //Odd
            return alternateSeriesSum(n-1) + n; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(alternateSeriesSum(n));
    }
}