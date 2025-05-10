//Find the GCD of two numbers using recursion

//1.. Brute Force
//TC : O(log(min(a,b)))
//SC : O(1)
// import java.util.Scanner;
// public class R10_GCD {

//     static int IGCD(int x , int y) {
//         while(x%y != 0) {
//             int rem = x%y;
//             x = y;
//             y = rem;
//         }
//         return y;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x = sc.nextInt();
//         int y = sc.nextInt();
//         System.out.println(IGCD(x,y));
//     }
// }


//2.. Recursive Approach(Euclidean Algorithm for GCD of two numbers)
//GCD(a,b) = GCD(b,a%b)
//GCD(a,0) = a
//GCD(0,b) = b

//TC : O(log(min(a,b)))
//SC : O(log(min(a,b)))

import java.util.Scanner;
public class R10_GCD {
    static int RGCD(int x , int y) {
        if(y==0) {
            return x;
        }
        return RGCD(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(RGCD(x,y));
    }
}
