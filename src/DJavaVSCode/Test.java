import java.io.PrintWriter;

public class Test  {

    public static void main(String[] args) throws Exception {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hello, World!");
        pw.close();
        System.out.println(10/0);

        
    }
}
