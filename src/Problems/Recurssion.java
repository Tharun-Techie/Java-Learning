package Problems;


public class Recurssion {
    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    static int fact(int n) {
        if (n == 1 || n == 0 ) return 1;
        return n * fact(n - 1);
    }

    static int pow(int a, int b){
        if (b == 0) return 1;
        return a * pow(a,b-1);
    }

    static String reverseString(String s){

        if (s.length()==0) return s;


        return reverseString(s.substring(1)) + s.charAt(0) ;
    }


    public static void main(String[] args) {


    }
}
