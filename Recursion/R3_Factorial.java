//3. Print Factorial Values

public class R3_Factorial {
    public static void main(String[] args)
    {
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }

    public static int factorial(int n) {
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}