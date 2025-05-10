//Power of a Number Using Recursion
//Example : 2^3 = 2*2*2 = 8

//TC : O(log n)
//SC : O(log n)
// import java.util.Scanner;
// public class R6_Power_Of_Number {
//     static int power(int a , int b) {
//         //Base Case
//         if(b==0) {
//             return 1;
//         }
//         //Recursive Call
//         int smallAns = power(a,b/2);
//         //Self Work
//         if(b%2==0) {
//             return smallAns*smallAns;
//         }
//         else {
//             return a*smallAns*smallAns;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(power(a,b));
//     }
// }


import java.util.Scanner;
public class R6_Power_Of_Number {
    static int power(int a , int b) {
        //Base Case
        if(b==0) {
            return 1;
        }
        //Recursive Call
       return a*power(a,b-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}


