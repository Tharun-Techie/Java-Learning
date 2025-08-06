package DJava;
import java.io.PrintWriter;

public class Test {
    public static void main(String[] args) throws Exception {
                PrintWriter pw = new PrintWriter("abc.txt");
            System.out.println(pw.append('o'));

    }
}
