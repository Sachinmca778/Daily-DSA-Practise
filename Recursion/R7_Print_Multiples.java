//Given a number num and a value k.print k multiples of num.
//Input : num = 12, k = 5
//Output : 12, 24, 36, 48, 60
//TC : O(k)
//SC : O(k)

import java.util.Scanner;
public class R7_Print_Multiples {

     static void print_multiples(int p , int q  ){
        //Base Case
        if(q==0) {
            return;
        }
        //Recursive Call
        print_multiples(p ,q-1);
        //Self Work
        System.out.println(p*q);
        
        
     }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        print_multiples(p,q);
	}
}

