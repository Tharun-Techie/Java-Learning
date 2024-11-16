package Basic_Concepts;

import java.nio.charset.StandardCharsets;

public class Strings_intro {
    public static void main(String[] args) {



//        actual diclearation
        String name = new String("hello");
        System.out.println(name);
        System.out.println(name.hashCode());

        String namee = "Hello wrold!";
        System.out.println(namee);

        String first_name = "Tharun";
        String Sec_name = "R";
        System.out.println(first_name+Sec_name);
        System.out.println(first_name.concat(" R"));

        System.out.println(first_name.charAt(5));

    }
}

