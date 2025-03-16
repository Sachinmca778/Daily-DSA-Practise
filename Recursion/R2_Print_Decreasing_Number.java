//2 Print Decreasing Number Using Recursion

import java.util.Scanner;

public class R2_Print_Decreasing_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
    }

    public static void printDecreasing(int n) { //5 4 3 2 1
        //Base Case
        if(n==1){
            System.out.println(n);
            return;
        }
        //Self Work
        System.out.println(n); //5  

        //Recursive Case
        printDecreasing(n-1); //4 3 2 1
    }
}

