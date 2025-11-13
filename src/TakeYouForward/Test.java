package TakeYouForward;

class Test {
    void main(String[] args) {
        long n = 900000000743l;
        int count = 0;
        for (long i = 1; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
        }

        if (count == 2) System.out.println("Yeh Prime no.");
        else System.out.println("No bruhh");

        System.out.println();

    }
}


class Test1 {
    void main(String[] args) {
        int n = 1000;

        int rev = 0;

        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        System.out.println(rev);
    }
}

class Test2{
    public static void main(String[] args) {
        int n = 150;
        int temp = n;
        int digit = String.valueOf(n).length();
        int sum = 0;
        while(n>0){
            int p = n % 10;
            sum = sum + (int)Math.pow(p,digit);
            n = n/10;
        }
        System.out.println(temp == sum?"Amstrong": "Not");

    }
}