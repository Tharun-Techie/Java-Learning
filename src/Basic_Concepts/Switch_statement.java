package Basic_Concepts;

import  java.util.Scanner;
public class Switch_statement {

    public static void main(String[] args) {
        int n ;
        Scanner inp = new Scanner(System.in);
            n = inp.nextInt();
        switch (n) {

            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesdat");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Pramadham");

        }

    }
}
