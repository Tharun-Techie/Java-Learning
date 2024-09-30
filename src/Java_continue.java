public class Java_continue {

    public static void main(String[] args) {
        int a = 100;
        int b =a;
        while (a==b){
            System.out.println(a);
                a++;
            System.out.println(b);
                continue;
        }
        a++;
        while (a!=a){
            break;
        }
    }
}
