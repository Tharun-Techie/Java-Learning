public class fibanacci {

    public static int fib(int n){
        if (n<=0) return 0;
        else if (n ==1) return 1;

        return fib(n-1) + fib (n-2);
    }

    public static void main(String[] args) {
        int n = 50;

        System.out.println(fib(n));

    }
}
