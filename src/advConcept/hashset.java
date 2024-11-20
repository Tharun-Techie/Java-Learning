package advConcept;

import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Set<String> val = new HashSet<>();
        val.add("Tharun");
        if (val.contains("Tharun")){
            System.out.println("yes bruh....");
        }
        System.out.println(val);
    }
}
