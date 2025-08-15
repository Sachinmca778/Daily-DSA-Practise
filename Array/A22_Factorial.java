
public class A22_Factorial {
    public static void main (String args[])
    {
        int  value = getfactorialvalue(4);
        System.out.println(value);
    }

    public static int getfactorialvalue (int n)
    {
            if(n==0 && n==1) {
                 return 1;
            }

            int factorial = 1;
            
            while( n>1) {
                factorial *= n;
                n--;
            }

            return factorial;
    }
}