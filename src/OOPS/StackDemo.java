package OOPS;

public class StackDemo {
    public static void main(String[] args) {
            Stack s1 = new Stack();
        System.out.println(s1.tos);
            s1.push(10);
            s1.pop();

        System.out.println(s1.tos);
        for (int a:s1.s){
            System.out.println(a);
        }

        System.out.println(s1.tos);

    }


}
