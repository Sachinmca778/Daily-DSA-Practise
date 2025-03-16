//Given an integer, FInd out the sum of its digits using Recursion.
//TC ; O(n)
//SC : O(n)

public class R5_Sum_Of_Digits {

    static int sod(int n) {
        //Base Case
        if (n>=0 && n<=9) {
            return n;
        }

        return sod(n/10) + (n%10);
    }
    public static void main (String[] args) {
        System.out.println(sod(2341));
    }
}