//Program to find nth fibonacci number.

//TC ; O(2^n)
//SC : O(n)

public class R4_Fibonacci {

    static int fib(int n) {
        //base case
        if(n==0 || n==1){ 
            return n;
        }

        return fib(n-1) + fib(n-2);   //prev + prevprev
    }

    public static void main(String[] args) {
        for(int i=0;i<=10;i++) {
            System.out.println(fib(i));
        }
        // System.out.println(fib(3));
    }
}