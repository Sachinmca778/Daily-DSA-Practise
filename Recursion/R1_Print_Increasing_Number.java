//Print Increasing Number Using Recursion

import java.util.Scanner;

public class R1_Print_Increasing_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }

    public static void printIncreasing(int n) {
        if(n==0){
            return;
        }
        printIncreasing(n-1);
        System.out.println(n);
    }

    // public static void printIncreasing(int n) {
    //     if(n==1){
    //         System.out.println(n);
    //         return;
    //     }
    //     printIncreasing(n-1);
    //     System.out.println(n);
    // }
}
