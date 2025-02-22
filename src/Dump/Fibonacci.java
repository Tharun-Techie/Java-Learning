package Dump;
import java.util.Scanner;
public class Fibonacci {

    static int fib(int n){
        if (n == 1)
            return 0;
        if (n==2)
            return 1;
        if (n==3)
            return 2;
        return fib(n-1) + fib(n-2) ;
    }

    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the fibonacci number");
//        int n = inp.nextInt();

        int res = fib(14);
        System.out.println("The value is: "+res);

    }
}
