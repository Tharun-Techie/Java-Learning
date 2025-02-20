package advConcept;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class RegexMatcher {
    public static void main(String[] args) {
        String sentence = "Betty Bought Some Butter But The Butter Was Bitter so she \n " +
                "bought some extra butter to make this bitter butter Better";
        /* taking user input */
        try {
            System.out.println("Enter the pattern to find:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            /* compile convert to regex pattern */
            Pattern pattern = Pattern.compile(input, Pattern.CASE_INSENSITIVE);
            /* matching pattern if in sentence*/
            Matcher matcher = pattern.matcher(sentence);
            if (matcher.find()) {
                System.out.println("Pattern Found");
            } else
                System.out.println("Pattern is Not Found");
            scanner.close();
        }
        catch (Exception e){
            System.out.println("Exception Found:"+e);
        }
        finally {
            System.out.println("Code Executed");
        }

    }
}
