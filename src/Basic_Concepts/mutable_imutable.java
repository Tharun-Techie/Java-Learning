package Basic_Concepts;

public class mutable_imutable {
    public static void main(String[] args) {
          String name  = "Tharun R";
          name = name + " Tharun R";
          // above new string constant variable creates on the pool

        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1==s2);
    }

}
